package com.jm0nn.baekjoon.silver.s3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열을 구하는 문제 (조합)
public class S3_15650_N과M2 {

	static int N, M; // 출력할 자연수의 갯수, 출력되는 배열의 크기
	static int[] arr; // 출력할 배열

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];

		dfs(0, 1); // 모든 수열을 확인하기 위한 깊이 우선 탐색

		System.out.println(sb);

		br.close();
	}

	// 깊이 우선 탐색
	static void dfs(int depth, int start) {
		if (depth == M) { // 출력할 배열의 크기에 도달했다면
			for (int i = 0; i < M; i++) // 배열 출력
				sb.append(arr[i]).append(' ');
			sb.append('\n');
			return; // 메서드 반환
		}

		for (int i = start; i <= N; i++) { // 사전 순으로 출력하기 위해 start부터 N까지 반복문 사용
			arr[depth] = i; // 배열에 해당 자연수 추가
			dfs(depth + 1, i + 1); // 다음 배열 탐색
		}

	}
}
