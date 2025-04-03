package level7.b2738;

import java.util.Scanner;

public class Main {
    static void getSum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = n*m;
        int[] matrix = new int[count];
        for (int i = 0; i < count; i++){
            matrix[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            matrix[i] += sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[k++]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        getSum();
    }
}
