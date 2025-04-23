package baekjoon.level12;

import java.util.Scanner;

public class b19532 {
    public static void main(String[] args) {
        int a, b, c, d, e, f;
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        for(int i = -999; i < 1000; i++){
            for(int j = -999; j < 1000; j++){
                if(a*i + b*j == c && d*i + e*j ==f){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.print(x + " " + y);
    }
}
