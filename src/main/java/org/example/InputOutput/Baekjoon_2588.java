package org.example.InputOutput;

import java.io.IOException;
import java.util.Scanner;

// 문제: (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

// 출력: 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
public class Baekjoon_2588 {
    public static void main(String[] args) throws IOException {
        // Scanenr 객체 생성
        Scanner scanner = new Scanner(System.in);

        // A,B를 입력 받음
        int A = scanner.nextInt();
        String B = scanner.next();

        // 값 계산
        // - '0'을 한 이유는 B가 charAt을 사용해 정수가 아닌 문자가 되어서 '0' = 48을 뺀다.
        System.out.println(A* (B.charAt(2) - '0'));
        System.out.println(A* (B.charAt(1) - '0'));
        System.out.println(A* (B.charAt(0) - '0') );
        System.out.println(A*Integer.parseInt(B));

        // 스캐너 종료
        scanner.close();
    }
}
