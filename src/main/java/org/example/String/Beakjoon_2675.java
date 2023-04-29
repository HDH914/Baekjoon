package org.example.String;


import java.util.Scanner;

// 문제: 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

// 입력: 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.

// 출력: 각 테스트 케이스에 대해 P를 출력한다.

public class Beakjoon_2675 {
    public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in);

      int T = scanner.nextInt();

      for (int i = 0; i < T; i++) {
          int R = scanner.nextInt();
          // nextLine()은 엔터값을 입력할 때를 기준으로 하니 공백을 기준으로 하는 next()사용!
          String S = scanner.next();

          for(int j = 0; j < S.length(); j++) {
              for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
                  System.out.print(S.charAt(j));
              }
          }

          System.out.println();
      }
    }
}
