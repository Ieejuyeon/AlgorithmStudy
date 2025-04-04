package level8.b2869;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 차례대로 낮, 밤, 나무
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        // 하루동안 올라간거리
        int d = A-B;
        // 튀어나온 부분
        int r = (V-B)%d;
        // 올라간 기간
        int days = ((V-B-r)/d)+1;;
        if(r==0) days--;

        System.out.print(days);
    }
}
