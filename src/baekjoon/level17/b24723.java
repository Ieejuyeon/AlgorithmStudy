package baekjoon.level17;

import java.util.Scanner;

public class b24723 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= 2;
        }
        System.out.println(result);
    }
}
