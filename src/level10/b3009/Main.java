package level10.b3009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                arr[j][i] = sc.nextInt();
            }
        }
        int x, y;
        x = arr[0][0];
        y = arr[1][0];
        if(x==arr[0][1]) x = arr[0][2];
        else if(x==arr[0][2]) x = arr[0][1];
        if(y==arr[1][1]) y = arr[1][2];
        else if(y==arr[1][2]) y = arr[1][1];

        System.out.print(x + " " + y);

    }
}
