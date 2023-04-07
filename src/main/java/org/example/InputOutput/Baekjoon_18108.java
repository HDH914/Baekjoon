package org.example.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: ICPC Bangkok Regional에 참가하기 위해 수환나품 국제 공항에 막 도착한 팀 레드 시프트ㅡ
// 일행은 눈을 믿을 수 없었다. 공항의, 대향 스크린에 올해가 2562년 이라고 적혀있었던 것이다.
// 불교국아인 태국은 불면기원, 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다.
// 반면, 우리나라는 서기 연도를 사용하고 있다. 불기연도가 주어질 떄 아를 서기 연도로 바꿔주는 프로그럄을 작성하시오.

// 입력: 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다.(1000 =< y =< 3000)
// 출력: 불기 연도를 서기 연도로 변환한 결과를 출력해라

public class Baekjoon_18108 {
    public static void main(String[] args) throws IOException{
        // BufferedReader,StringTokenizer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 불기 연도, 서기 연도
        int y = Integer.parseInt(st.nextToken());
        int year = y - 543;

        // 서기 연도 출력
        System.out.println(year);

        // BufferedReader 종료
        br.close();
    }
}
