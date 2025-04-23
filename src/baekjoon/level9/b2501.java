package baekjoon.level9;

import java.util.Scanner;

public class b2501 {
    public static void main(String[] args) {
        int N, K, count, temp;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        count = 0;
        temp = 0;
        for(int i = 1; i < N+1; i++){
            if(N%i==0){
                temp = i;
                count++;
            }
            if(K==count){
                break;
            }
        }
        if(K>count) System.out.print(0);
        else System.out.print(temp);
    }
}
