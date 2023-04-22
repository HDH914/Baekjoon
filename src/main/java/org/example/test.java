package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws Exception {
        // 콘솔에서 입력받을 경우
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 파일에서 입력 받을 경우
        FileReader fr = new FileReader("example.txt"); // example.txt는 파일 이름

        String str = br.readLine();  // 일반 문자열로 받기
        int num = Integer.parseInt(br.readLine());  // 문자열을 정수로 변환 후 받기

        br.close();  // 스트림 종료
    }
}
