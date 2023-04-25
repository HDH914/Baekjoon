package org.example.array;

import java.util.Scanner;

public class Beakjoon_10813 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 공의 개수
        int m = scanner.nextInt(); // 공을 바꾸는 횟수

        // 공의 위치를 저장할 배열 초기화
        int[] balls = new int[n];
        for (int i = 0; i < n; i++) {
            balls[i] = i + 1;
        }

        // 공을 바꾸는 작업 수행
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int temp = balls[x - 1];
            balls[x - 1] = balls[y - 1];
            balls[y - 1] = temp;
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.print(balls[i] + " ");
        }

        scanner.close();
    }
}
