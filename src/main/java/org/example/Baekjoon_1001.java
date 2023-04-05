package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1001 {
    public static void main(String args[]) throws IOException {
        // BufferedReader, StringTokenizer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 변수할당
        // 입력된 문자열을 Integer 타입으로 변환
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 두 수의 차 출력
        System.out.println(A - B);

        // BufferedReader 종료
        br.close();
    }
}
