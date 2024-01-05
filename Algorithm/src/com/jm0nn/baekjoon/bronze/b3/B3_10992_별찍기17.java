package com.jm0nn.baekjoon.bronze.b3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B3_10992_별찍기17 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 별 모양 층수

		int blank = N - 1; // 한 행의 앞 부분 빈 공간 갯수
		for (int i = 0; i < N; i++) {
			for (int j = blank--; j > 0; j--) // 한 행의 앞 부분 빈 공간 출력
				sb.append(' ');

			for (int j = 0; j < i * 2 + 1; j++) {
				if (i != N - 1 && 0 < j && j < i * 2) // 빈 공간 출력
					sb.append(' ');
				else // 별 출력
					sb.append('*');
			}

			sb.append('\n');
		}

		System.out.println(sb);

		br.close();
	}
}
