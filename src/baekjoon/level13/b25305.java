package baekjoon.level13;

import java.util.Scanner;

public class b25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, temp;
        int[] x;

        n = sc.nextInt();
        k = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if(x[j] < x[j+1]){
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        System.out.print(x[k-1]);
    }
}
