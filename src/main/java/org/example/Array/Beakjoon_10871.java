package org.example.Array;

import java.util.Scanner;

// 문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

// 출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

public class Beakjoon_10871 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 배열 개수
        int X = scanner.nextInt();  // 기준값

        int[] A = new int[N];  // 크기 N의 배열생성

        for(int i=0; i<A.length; i++){
            A[i] = scanner.nextInt();
        }

        // 배열을 전부 반복해서 기준값 X보다 작은값들은 출력
        for(int i=0; i<A.length; i++){
            if(A[i] < X){
                System.out.print(A[i] + " ");
            }
        }
        scanner.close();  // scanner 종료
    }
}
