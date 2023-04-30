package org.example.Array;

import java.util.Scanner;

// 문제: 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
// 예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면,
// 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

// 입력: 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.

// 출력: 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

public class Beakjoon_2562 {
    public static void main(String[] args){
        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        int[] ar = new int[9];  // 크기 9의 배열 생성
        // 최댓값, 최댓값 인덱스 변수 생성
        int max = 0;
        int maxIndex= 0;

        // 배열 입력
        for(int i = 0; i < ar.length; i++){
            ar[i] = scanner.nextInt();
        }

        // 배열 비교 후 최댓값과 최댓값 인덱스 추출
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
                // 최댓값의 인덱스가 아닌 몇번째 수인지 출력해야하기 때문에 i + 1(인덱스는 0부터 시작하기 때문)
                maxIndex = i + 1;
            }
        }

        // 최댓값, 최댓값 인덱스 출력
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
