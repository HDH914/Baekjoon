package org.example.Iteration;

import java.util.Scanner;

// 문제: N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
// 입력: 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
// 출력: 출력형식과 같게 N*1부터 N*9까지 출력한다.
public class Beakjoon_2739 {
    public static void main(String[] args){
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 변수 생성
        int x = scanner.nextInt();

        // 구구단 만드는 반복문
        for(int i = 1; i < 10; i++){
            System.out.println(x + " * " + i + " = " + x*i );
        }
    }
}
