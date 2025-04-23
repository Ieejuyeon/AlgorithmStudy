package baekjoon.level8;

import java.util.Scanner;

public class b2745 {
    static int convert(char c){
        if(c>='A') return c-'A'+10;
        else return c-'0';
    }
    static int getPower(int b, int times){
        int result = 1;
        for(int i = 0; i < times; i++){
            result = result*b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        int count = 0;
        for(int i = 0; i < n.length(); i++){
            count += convert(n.charAt(i))*getPower(b, n.length()-i-1);
        }
        System.out.print(count);
    }
}
