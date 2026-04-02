package baekjoon.marathon96;

import java.util.Scanner;

public class b25591 {
    public static void main(String[] args) {
        int a, b, c, d, q, r, x, y;
        Scanner sc= new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        a = 100-x;
        b = 100-y;
        c = 100 - (a+b);
        d = a*b;
        q = d/100;
        r = d%100;
        System.out.printf("%d %d %d %d %d %d\n%d %d", a,b,c,d,q,r,c+q,r);

    }
}
