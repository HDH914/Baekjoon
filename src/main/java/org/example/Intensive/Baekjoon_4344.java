package org.example.Intensive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Baekjoon_4344 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[];

        int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수
        StringTokenizer st;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," ");

            int N = Integer.parseInt(st.nextToken());  //학생 수
            arr = new int[N];

            double sum = 0;  // 성적 총합

            // 성적 입력 부분
            for(int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());  // 성적 저장
                arr[j] = score;
                sum = sum + score;
            }

            double average = (sum/N);
            double count = 0;

            // 평균을 넘는 학생 비율
            for(int j = 0; j < N; j++){
                if(arr[j] > average){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
