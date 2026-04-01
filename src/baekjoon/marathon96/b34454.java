package baekjoon.marathon96;

import java.util.Scanner;

public class b34454 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c, p;
        n = sc.nextInt();
        c = sc.nextInt();
        p = sc.nextInt();
        if(c*p>n) System.out.println("no");
        else System.out.println("yes");
    }
}
