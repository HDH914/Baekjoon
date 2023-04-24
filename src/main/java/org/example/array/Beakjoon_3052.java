package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Beakjoon_3052 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // Scanner 생성

        int[] remainder = new int[10];  // 크기 10의 나머지가 들어갈 배열 생성
        int notSame = 1;                // 몫이 같은것이 있는지 확인할 변수 생성

        // A를 42로 나눈 나머지를 배열에 담음.
        for(int i = 0; i < 10; i++){
            int A = scanner.nextInt();
            int result = A % 42;

            remainder[i] = result;
        }
        Arrays.sort(remainder);  // 배열 오름차순으로 정리

        // 배열에 담긴 나머지를 서로 비교하여 같은 것이 있는지 확인
        for(int i = 1; i < remainder.length; i++){
            // i - 1번 인덱스와 i번 인덱스의 나머지가 같지 않으면 카운트업
            if(remainder[i - 1] != remainder[i]){
                notSame = notSame + 1;
            }
        }
        System.out.println(notSame);
    }
}
