package org.example.String;

import java.util.Scanner;

public class Beakjoon_11654 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 스캐너 생성

        char c = scanner.nextLine().charAt(0);     // 문자 입력
        int ascii = (int)c;                        // 문자를 정수로 변환

        System.out.println(ascii);                 // 값 출력

        scanner.close();  // 스트림 종료
    }
}
