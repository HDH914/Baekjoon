package org.example.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

// 입력: 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
// 출력: 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
public class Beakjoon_2753 {
    public static void main(String[] args) throws IOException{
        // BufferedReader, StringTokenizer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 변수 생성
        int year = Integer.parseInt(st.nextToken());

        // 입력시 출력되는 조건문
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

        // BufferedReader 종료
        br.close();
    }
}
