package org.example.Iteration;

import java.util.Scanner;

// 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력: 각 테스트 케이스마다 A+B를 출력한다.

public class Beakjoon_10950 {
    public static void main(String[] args){
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 반복할 횟수
        int T = scanner.nextInt();

        // 반복 조건
        for(int i = 0; i < T; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }

        // scanner 종료
        scanner.close();
    }
}
