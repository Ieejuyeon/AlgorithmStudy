package baekjoon.level6;

import java.util.Scanner;

public class b25206 {
    //멤버변수이므로 0으로 자동 초기화
    static double totalScore;
    static double totalGrade;
    static double answer;
    static void getScore(double grade, String scoreString){
        double score;
        switch (scoreString) {
            case "A+" : score = 4.5; break;
            case "A0" : score = 4.0; break;
            case "B+" : score = 3.5; break;
            case "B0" : score = 3.0; break;
            case "C+" : score = 2.5; break;
            case "C0" : score = 2.0; break;
            case "D+" : score = 1.5; break;
            case "D0" : score = 1.0; break;
            case "F" : score = 0; break;
            default: return;
        }
        totalScore += grade*score;
        totalGrade += grade;
    }

    static void getAnswer(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 20; i++){
            sc.next();
            getScore(sc.nextDouble(), sc.next());
        }
        answer = totalScore/totalGrade;
    }

    public static void main(String[] args){
        getAnswer();
        System.out.println(answer);
    }
}
