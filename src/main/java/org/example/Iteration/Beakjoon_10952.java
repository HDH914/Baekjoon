package org.example.Iteration;

import java.util.Scanner;

// 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 입력의 마지막에는 0 두 개가 들어온다.

// 출력: 각 테스트 케이스마다 A+B를 출력한다.

public class Beakjoon_10952 {
    public static void main(String[] args){
        // Scnner 생성
        Scanner scanner = new Scanner(System.in);

        // 반복문 실행
        while (true){
            // 정수 입력
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // A와 B가 둘다 0이면 break문으로 반복문 탈출
            if (A == 0 && B == 0){
                // scanner 종료
                scanner.close();
              break;
            }
            // 두 정수의 합 출력
            System.out.println(A + B);
        }
    }
}
