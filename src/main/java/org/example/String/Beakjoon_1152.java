package org.example.String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 문자열을 공백으로 구분함
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        System.out.print(st.countTokens());  // 토큰 갯수 출력
    }
}
