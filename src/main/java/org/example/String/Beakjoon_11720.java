package org.example.String;

import java.util.Scanner;

public class Beakjoon_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner 생성

        int T = scanner.nextInt();    // 테스트 개수
        String str = scanner.next();  // 문자열 입력

        int sum = 0;                  // 총 합

        for(int i = 0; i < T; i++) {
            char c = str.charAt(i);  // 입력받은 문자열을 하나씩 뽑아냄
            int num = Integer.parseInt(String.valueOf(c));  // 뽑아낸 문자열을 정수로 변환
            sum = sum + num;  // 하나씩 더함
        }
        System.out.println(sum);  // 결과값 출력

        scanner.close();  // 스트림 종료
    }
}
