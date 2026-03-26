package baekjoon;

import java.util.Scanner;

public class b8370 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(array[0]*array[1]+array[2]*array[3]);
    }
}
