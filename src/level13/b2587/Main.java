package level13.b2587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] n = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            n[i] = sc.nextInt();
            sum += n[i];
        }
        int temp;
        for(int i = 0; i < 5; i ++){
            for(int j = i+1; j < 5; j++){
                if(n[i] < n[j]){
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println(sum/5);
        System.out.print(n[2]);

    }
}
