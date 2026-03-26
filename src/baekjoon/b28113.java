package baekjoon;

import java.util.Scanner;

public class b28113 {
    public static void main(String[] args) {
        int a, b, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if(b<n||b>a){
            System.out.println("Bus");
        }
        else if(a==b){
            System.out.println("Anything");
        }
        else System.out.println("Subway");
    }
}
