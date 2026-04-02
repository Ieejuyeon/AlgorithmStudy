package baekjoon.marathon96;

import java.util.Scanner;

public class b26546 {
    public static void main(String[] args) {
        int n, a, b;
        String s;
        char[] c;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            s = sc.next();
            c = s.toCharArray();
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = 0; j < a; j++){
                System.out.print(c[j]);
            }
            for(int j = b; j < s.length(); j++){
                System.out.print(c[j]);
            }
            System.out.println();
        }
    }
}
