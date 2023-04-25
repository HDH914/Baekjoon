package org.example.array;

import java.util.Scanner;

public class Beakjoon_10811 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 바구니의 개수
        int m = scanner.nextInt(); // 바구니를 뒤집는 횟수

        // 바구니의 위치를 저장할 배열 초기화
        int[] baskets = new int[n];
        for (int i = 0; i < n; i++) {
            baskets[i] = i + 1;
        }

        // 바구니를 뒤집는 작업 수행
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            reverse(baskets, x - 1, y - 1);
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.print(baskets[i] + " ");
        }

        scanner.close();
    }

    // 배열의 구간을 역순으로 뒤집는 메소드
    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
