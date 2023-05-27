package org.example.Intensive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다. 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
// 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
// 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
// 인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
// P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.

// 입력: 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.

// 출력: 치훈이의 전공평점을 출력한다.
public class Beakjoon_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[20];
        double totalSum = 0;
        double scoreSum = 0;
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            str[i] = bfr.readLine();
            StringTokenizer st = new StringTokenizer(str[i], " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {
                    totalSum += score * gradeScore[j];
                    if (j != 9) {
                        scoreSum += score;
                    }
                }
            }
        }

        double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);

        bfr.close();
    }
}
