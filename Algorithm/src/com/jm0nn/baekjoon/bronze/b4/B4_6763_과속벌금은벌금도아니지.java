package com.jm0nn.baekjoon.bronze.b4;

import java.io.*;

public class B4_6763_과속벌금은벌금도아니지 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int dif = speed - limit;
        String answer = "Congratulations, you are within the speed limit!";
        if (dif > 0) {
            answer = "You are speeding and your fine is $";
            if (dif <= 20) answer += "100.";
            else if (dif <= 30) answer += "270.";
            else answer += "500.";
        }
        System.out.print(answer);
    }
}
