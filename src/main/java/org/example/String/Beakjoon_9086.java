package org.example.String;

import java.util.Scanner;

public class Beakjoon_9086 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  //Scanner 생성

        int T = scanner.nextInt();    // 테스트 케이스 개수

        // T 개수만큼 반복
        for(int i = 0; i < T; i++){
            String str = scanner.next();        // 문자열 입력
            char c1, c2 = ' ';                  // 첫 글자와 마지막 글자를 담을 변수 생성

            c1 = str.charAt(0);                 // 첫 글자 담음
            c2 = str.charAt(str.length() - 1);  // 마지막 글자 담음

            String result = new String(new char[]{c1, c2});  // String 타입으로 형변환
            System.out.println(result);  // 결과 출력
        }
        scanner.close();  //scanner 종료
    }
}
