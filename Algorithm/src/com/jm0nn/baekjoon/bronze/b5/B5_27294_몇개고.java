package com.jm0nn.baekjoon.bronze.b5;

import java.io.*;
import java.util.*;

public class B5_27294_몇개고 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		System.out.print((s == 1 || 12 > t || t > 16) ? 280 : 320);
	}

}
