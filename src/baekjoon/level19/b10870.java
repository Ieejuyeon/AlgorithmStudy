package baekjoon.level19;

import java.util.Scanner;

public class b10870 {
    static int fib(int n){
        if(n<2) return n;
        else return(fib(n-1)+fib(n-2));
    }
    public static void main(String[] args) {
        System.out.println(fib(new Scanner(System.in).nextInt()));
    }
}
