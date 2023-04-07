package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 두 자연수가 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
// 입력: 두 자연수 A와 B가 주어진다.
// 출력: 첫째줄에 A+B, 둘째줄에 A-B, 셋째줄에 A*B, 넷째줄에 A/B, 다섯째줄에 A%B를 출력한다.
public class Baekjoon_10869 {
    public static void main(String[] args) throws IOException {
        // BufferedReader, StringTokenier 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // A, B 값 입력
        // 문자열을 Integer 타입으로 변환
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 두수의 사칙연산값 출력
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        // BufferedReader 종료
        br.close();
    }
}
