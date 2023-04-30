package org.example.Array;

import java.util.Scanner;

public class Beakjoon_5597 {
    public static void main(String[] args){
        // Scanner 생성
        Scanner scanner = new Scanner(System.in);

        int[] rollBook = new int[30];  // 전체 출석부
        int[] ar = new int[28];  // 제출 배열
        int[] ar2 = new int[2];  // 제출 안한 배열

        // 전체 출석부(1~30)
        for(int i = 0; i<rollBook.length; i++){
            rollBook[i] = i + 1;
        }

        // 제출한 사람(임의로 28개 정수 입력)
        for (int i = 0; i <ar.length; i++) {
            ar[i] = scanner.nextInt();
        }

        // 전체 출석부와 제출한 출석부를 비교해 없는 정수 2개를 ar2에 추가
        int idx = 0;
        for (int i = 1; i <= 30; i++) {
            if (idx == 2) break;  // ar2 배열이 다 찼으면 루프 종료
            boolean found = false;  // i 값이 ar 배열에 있는지 여부
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] == i) {
                    found = true;  // i 값이 ar 배열에 있으면 found를 true로 설정
                    break;
                }
            }
            if (!found) {
                ar2[idx] = i;  // i 값이 ar 배열에 없으면 ar2 배열에 추가
                idx++;
            }
        }
        System.out.println(ar2[0]);
        System.out.println(ar2[1]);
    }
}
