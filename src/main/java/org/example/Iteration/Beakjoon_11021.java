package org.example.Iteration;

// 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

// 출력: 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

import java.util.Scanner;

public class Beakjoon_11021 {
    public static void main(String[] args){
        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int x = 1; x < T + 1; x++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();;

            System.out.println("Case #" + x + ": " + (A + B));
        }

        // scanner 종료
        scanner.close();
    }
}
