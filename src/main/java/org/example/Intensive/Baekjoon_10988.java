package org.example.Intensive;

import java.util.Scanner;

public class Baekjoon_10988 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);  // 스트림 생성

        String str = scanner.nextLine();  // 문자열 입력

        // 스트링 버퍼 생성
        StringBuffer reverse;
        reverse = new StringBuffer(str);

        String result = reverse.reverse().toString();  //result변수에 str문자열을 거꾸로 담음

        // 처음 입력한 str과 반대과 된 result가 같으면 1출력, 아니면 0 출력
        if(str.equals(result)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
