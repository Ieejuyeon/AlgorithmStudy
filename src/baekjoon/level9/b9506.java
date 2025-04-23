package baekjoon.level9;

import java.util.Scanner;

public class b9506 {
    static void perfect(int n){
        String s = n + " = 1";
        int sum = 1;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                sum += i;
                s = s + " + " + i;
            }
        }

        if(sum==n){
            System.out.println(s);
        }
        else {
            System.out.println(n + " is NOT perfect.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n!=-1){
            perfect(n);
            n = sc.nextInt();
        }
    }
}
