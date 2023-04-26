package org.example.String;

import java.util.Scanner;

public class Beakjoon_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();

        System.out.println(s.charAt(i - 1));
    }
}
