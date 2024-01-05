package com.jm0nn.baekjoon.bronze.b1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1_2775_부녀회장이될테야 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());

			int[][] apt = new int[k + 1][n + 1];

			for (int i = 0; i <= n; i++)
				apt[0][i] = i;

			for (int i = 1; i <= k; i++)
				for (int j = 1; j <= n; j++)
					apt[i][j] = apt[i][j - 1] + apt[i - 1][j];

			sb.append(apt[k][n]).append('\n');
		}

		System.out.println(sb);
	}

}
