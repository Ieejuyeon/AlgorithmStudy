package baekjoon.level9;

import java.util.Scanner;

public class b5086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        while(true){
            n=sc.nextInt();
            m=sc.nextInt();

            if(n==0&&m==0){
                break;
            }
            else if(m==0||n==0){
                System.out.println("neither");
            }
            else if(m%n==0){
                System.out.println("factor");
            }
            else if(n%m==0){
                System.out.println("multiple");
            }
            else System.out.println("neither");
        }
    }
}
