package baekjoon.level9;

import java.util.Scanner;

public class b11653 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        while(N!=1){
            for(int i = 2; i < N+1; i++){
                if(N%i==0){
                    System.out.println(i);
                    N = N/i;
                    break;
                }
            }
        }
    }
}
