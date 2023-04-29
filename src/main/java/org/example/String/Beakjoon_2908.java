package org.example.String;

import java.util.Scanner;

public class Beakjoon_2908 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        // 문자열로 변환
        String AS = String.valueOf(A);
        String BS = String.valueOf(B);

        // 문자열 뒤집기
        StringBuffer sb1, sb2;
        sb1 = new StringBuffer(AS);
        sb2 = new StringBuffer(BS);

        String reverseA = sb1.reverse().toString();
        String reverseB = sb2.reverse().toString();

        // 다시 정수로 변환
        int A1 = Integer.parseInt(reverseA);
        int B1 = Integer.parseInt(reverseB);

        // 두 수 크기 비교하기
        if(A1 > B1){
            System.out.println(A1);
        }
        if (B1 > A1){
            System.out.println(B1);
        }

        scanner.close();  // 스트림 종료
    }
}
