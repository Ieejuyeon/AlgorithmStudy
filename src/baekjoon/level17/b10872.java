package baekjoon.level17;

import java.util.Scanner;

public class b10872 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[] fac = new int[13];
        fac[0] = 1;
        for(int i = 1; i < n+1; i++){
            fac[i] = fac[i-1]*i;
        }
        System.out.print(fac[n]);
    }
}
