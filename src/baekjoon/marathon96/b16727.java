package baekjoon.marathon96;

import java.util.Scanner;

public class b16727 {
    public static void main(String[] args) {
        int p1, s1, p2, s2;
        Scanner sc= new Scanner(System.in);
        p1 = sc.nextInt();
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        p2 = sc.nextInt();
        if(p1+p2>s1+s2){
            System.out.println("Persepolis");
        }
        else if(s1+s2>p1+p2){
            System.out.println("Esteghlal");
        }
        else {
            if(s1>p2){
                System.out.println("Esteghlal");
            }
            else if(s1<p2){
                System.out.println("Persepolis");
            }
            else System.out.println("Penalty");
        }
    }
}
