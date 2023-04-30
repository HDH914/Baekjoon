package org.example.Array;

import java.util.Arrays;
import java.util.Scanner;

// 문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

// 출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
public class Beakjoon_10818 {
    public static void main(String[] args){
        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 배열 크기 입력
        int[] ar = new int[N];      // 크기 N의 배열 생성
        int max, min;               // 최솟값, 최댓값 변수 생성

        // 배열 입력
        for(int i=0; i < N; i++){
            ar[i] = scanner.nextInt();
        }

        Arrays.sort(ar);  // 배열 오름차순으로 정렬
        min = ar[0];      // 최솟값
        max = ar[N - 1];  // 최댓값

        System.out.println(min + " " + max);  // 최솟값, 최댓값 출력

        scanner.close();  // scanner 종료
    }
}
