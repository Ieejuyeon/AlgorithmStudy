package baekjoon.level10;

import java.util.Scanner;

public class b14215 {
    public static void main(String[] args) {
        int[] n = new int[3];
        int len, max;
        Scanner sc = new Scanner(System.in);
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();

        max = 0;
        if(n[max]<n[1]) max = 1;
        if(n[max]<n[2]) max = 2;

        int i = n[0] + n[1] + n[2];
        if(max==0){
            if(n[0]>=n[1]+n[2]) System.out.print(-1+n[2]+n[1]+n[2]+n[1]);
            else System.out.print(i);
        }
        if(max==1){
            if(n[1]>=n[0]+n[2]) System.out.print(-1+n[0]+n[2]+n[2]+n[0]);
            else System.out.print(i);
        }
        if(max==2){
            if(n[2]>=n[1]+n[0]) System.out.print(-1+n[1]+n[0]+n[1]+n[0]);
            else System.out.print(i);
        }

    }
}
