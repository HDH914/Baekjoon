package org.example.Iteration;

import java.io.*;
import java.util.StringTokenizer;
// 문제: Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// 입력: 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.

// 출력: 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.

public class Beakjoon_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int A,B;
        StringTokenizer st;

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            bw.write((A+B) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
