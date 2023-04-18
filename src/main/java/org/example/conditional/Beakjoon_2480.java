package org.example.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int prize;

       if(a == b && a == c){
           prize = 10000 + a * 1000;
           System.out.println(prize);
       }else if(a == b || a == c){
           prize = 1000 + a * 100;
           System.out.println(prize);
       }else if(b == c){
           prize = 1000 + b * 100;
           System.out.println(prize);
       }else{
           System.out.println((Math.max(a, Math.max(b, c))) * 100);
       }

       br.close();
    }
}
