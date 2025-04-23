package baekjoon.level8;

import java.util.Scanner;
import java.util.Vector;

public class b11005 {
    public static void main(String[] args){
        int N, B, lastIndex;
        Vector<Integer> pow;
        Vector<Integer> converted;
        Scanner sc;

        converted = new Vector<>();
        pow = new Vector<>();
        sc = new Scanner(System.in);
        N = sc.nextInt();
        B = sc.nextInt();
        pow.add(1);

        while(pow.get(pow.size()-1) <= N){
            pow.add((int) Math.pow(B, pow.size()));
        }
        pow.remove(pow.size()-1);

        lastIndex = pow.size()-1;
        for(int i = 0; i < pow.size(); i++){
            converted.add(N/pow.get(lastIndex-i));
            N = N%pow.get(lastIndex-i);
        }

        for (int i : converted) {
            if (i >= 10) {
                System.out.print((char) (i + 'A' - 10));
            } else System.out.print(i);
        }
    }
}
