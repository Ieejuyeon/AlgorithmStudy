package baekjoon.level19;

import java.util.Scanner;

public class b27433 {
    static long fac(int n){
        if(n==1||n==0) return 1;
        else return fac(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(fac(new Scanner(System.in).nextInt()));
    }
}
