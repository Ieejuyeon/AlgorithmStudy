package level13.b2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, temp;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n-1; i ++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
