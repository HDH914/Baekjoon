package org.example.Array;

import java.io.IOException;
import java.util.Scanner;

// 문제: 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

// 출력: 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

public class Beakjoon_10807 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);  // Scanner 생성

        int N = scanner.nextInt();  // 배열 갯수 입력
        int[] ar = new int[N];  // N개의 배열 생성

        int sum = 0;  // v의 총 갯수

        // 배열 입력
        for(int i = 0; i < N; i++){
            ar[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();  // 찾을 정수 입력

        for(int i = 0; i < ar.length; i++) {
            if(v == ar[i]){  // ar[i]과 v의 값이 같으면 카운트한다
                sum = sum + 1;
            }
        }

        System.out.println(sum);  // v의 총 갯수 출력

        scanner.close();  // scanner 종료
    }
}
