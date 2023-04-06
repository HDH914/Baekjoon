package org.example.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// A + B 문제(1000번)
// 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
// 입력: 첫째줄에 A와 B가 주어진다.(0 < A, B < 10)
// 출력: 첫째줄에 A+B를 출력한다.
public class Baekjoon_1000 {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // A, B 값 입력
        // 입력 문자열을 Integer 타입으로 변환
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A + B 값 출력
        System.out.println(A + B);

        // BufferedReader 종료
        br.close();
    }
}
