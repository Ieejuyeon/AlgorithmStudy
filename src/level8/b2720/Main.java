package level8.b2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        int[] coin = new int[] {25, 10, 5, 1};
        r = sc.nextInt();
        for(int i = 0; i < r; i++ ){
            n = sc.nextInt();
            for(int j = 0; j < 4; j++) {
                System.out.print(n/coin[j] + " ");
                n = n%coin[j];
            }
            System.out.println();
        }
    }
}
