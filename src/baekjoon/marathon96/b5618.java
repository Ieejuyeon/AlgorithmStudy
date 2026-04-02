package baekjoon.marathon96;

import java.util.Scanner;

public class b5618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("1");
        if(n==2){
            if(arr[0]<=arr[1]){
                for(int i = 2; i <= arr[0]; i++){
                    if(arr[0]%i==0){
                        if(arr[1]%i==0){
                            System.out.println(i);
                        }
                    }
                }
            }
            else{
                for(int i = 2; i <= arr[1]; i++){
                    if(arr[1]%i==0){
                        if(arr[0]%i==0){
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        else {
            if(arr[0]<=arr[1]&&arr[0]<=arr[2]){
                for(int i = 2; i <= arr[0]; i++){
                    if(arr[0]%i==0){
                        if(arr[1]%i==0&&arr[2]%i==0){
                            System.out.println(i);
                        }
                    }
                }
            }
            else if (arr[1]<=arr[0]&&arr[1]<=arr[2]){
                for(int i = 2; i <= arr[1]; i++){
                    if(arr[1]%i==0){
                        if(arr[0]%i==0&&arr[2]%i==0){
                            System.out.println(i);
                        }
                    }
                }
            }
            else{
                for(int i = 2; i <= arr[2]; i++){
                    if(arr[2]%i==0){
                        if(arr[1]%i==0&&arr[0]%i==0){
                            System.out.println(i);
                        }
                    }
                }
            }
        }

    }
}
