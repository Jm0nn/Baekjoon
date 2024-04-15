WITH A AS (
    SELECT ID, PERCENT_RANK() OVER(ORDER BY SIZE_OF_COLONY DESC) AS RAN
    FROM ECOLI_DATA)
SELECT ID, (CASE 
                WHEN RAN <= 0.25 THEN 'CRITICAL'
                WHEN RAN <= 0.5 THEN 'HIGH'
                WHEN RAN <= 0.75 THEN 'MEDIUM'
                ELSE 'LOW'
            END) AS COLONY_NAME
FROM A
ORDER BY ID ASC;