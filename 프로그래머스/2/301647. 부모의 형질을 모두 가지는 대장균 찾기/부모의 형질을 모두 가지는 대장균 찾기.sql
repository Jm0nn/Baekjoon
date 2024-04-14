SELECT E.ID, E.GENOTYPE, P.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA AS E
JOIN ECOLI_DATA AS P
ON E.PARENT_ID = P.ID
WHERE E.GENOTYPE & P.GENOTYPE = P.GENOTYPE
ORDER BY E.ID ASC;