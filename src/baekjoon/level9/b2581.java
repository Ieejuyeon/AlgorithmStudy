package baekjoon.level9;

import java.util.Scanner;

public class b2581 {
    public static void main(String[] args) {
        int M, N;
        int min, sum;
        Scanner sc = new Scanner(System.in);
        boolean decimal;

        M=sc.nextInt();
        N=sc.nextInt();
        min = 10001;
        sum = 0;

        for(int i = M; i < N+1; i++){
            decimal = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    decimal = false;
                }
            }
            if((decimal||i==2)&&i!=1){
                if(min>i) min = i;
                sum += i;
            }
        }
        if(sum==0) System.out.print(-1);
        else System.out.print(sum + "\n" + min);
    }
}
