package org.example.String;

import java.io.*;

public class Beakjoon_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        // 스트림 종료
        br.close();
    }
}
