package org.example.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 문제: A는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
// A는 놀람을 ??!로 표현한다. A가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때
// 놀람을 표현하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다.
// 아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
// 출력: 첫째 줄에 A의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.

public class Baekjoon_10926 {
    public static void main(String[] args) throws IOException {
        // BufferedReader,StringTokenizer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String id = st.nextToken();

        System.out.println(id + "??!");

        // BufferedReader 종료
        br.close();
    }
}















