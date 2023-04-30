package org.example.Array;

import java.util.Scanner;

// 문제: 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

// 입력: 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

// 출력: 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

public class Beakjoon_1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 시험본 과목 수
        double[] scoreArray = new double[N]; // 시험 점수 배열
        double maxScore = 0; // 최대 점수
        double sum = 0; // 변경된 점수의 합

        // 시험 점수 입력받기
        for (int i = 0; i < N; i++) {
            double score = scanner.nextDouble();
            scoreArray[i] = score;
            // 최대 점수 갱신
            if (score > maxScore) {
                maxScore = score;
            }
        }

        // 변경된 점수 계산
        for (int i = 0; i < N; i++) {
            scoreArray[i] = scoreArray[i] / maxScore * 100.0;
            sum += scoreArray[i];
        }

        // 평균 점수 계산 및 출력
        double average = sum / N;
        System.out.printf("%.2f", average);

        scanner.close();
    }
}



//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();  // 시험본 과목을 개수
//        double[] scoreArray = new double[N];  // 시험 점수 배열
//        double sum = 0;
//        double average = 0;  // 시험 평균 점수
//
//        //M은 최고 점수 나머지는 /M*100
//        // 배열에 점수 입력
//        for(int i=0; i<N; i++){
//            int score = scanner.nextInt();
//            scoreArray[i] = score;
//        }
//        Arrays.sort(scoreArray);  // 배열 오름차순으로 정리
//        System.out.println("조작 전 점수 배열");
//        System.out.println(Arrays.toString(scoreArray));
//
//        double M = scoreArray[N - 1];  // 최고 점수
//
//        // 조작 점수, 모든 점수에  점수/M*100을 하고 다시 배열에 넣음
//        for(int i=0; i<N; i++){
//            scoreArray[i]= scoreArray[i]/M*100;
//        }
//        System.out.println("조작 후 점수 배열");
//        System.out.println(Arrays.toString(scoreArray));
//
//        // 최고 점수 이외의 점수 모두 더하기
//        for(int i = 0; i < scoreArray.length; i++){
//            sum = sum + scoreArray[i];
//        }
//        average = sum / N;
//        System.out.println("평균");
//        System.out.printf("%.2f", average);
//
//        scanner.close();