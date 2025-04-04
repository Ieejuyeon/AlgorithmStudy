package level8.b2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력받는 것이 한번뿐이므로 익명객체 사용
        int N = new Scanner(System.in).nextInt();
        //사각형이 한 줄에 1개, 2개, 4개... 2^N개의 사각형로 이루어짐
        int boxes = (int) Math.pow(2, N);
        //한 줄의 점의 개수는 한 줄의 사각형의 개수 +1
        int dotsInline = boxes+1;
        //전체 점의 개수는 한 줄의 점의 개수의 제곱
        System.out.print(dotsInline*dotsInline);
    }
}
