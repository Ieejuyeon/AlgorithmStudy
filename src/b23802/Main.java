package b23802;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            for(int i = 0; i < N; i++){
                for(int j = 0; j < 5*N; j++){
                    System.out.print("@");
                }
                System.out.print("\n");
            }
            for(int i = 0; i < 4*N; i++) {
                for(int j = 0; j < N; j++){
                    System.out.print("@");
                }
                System.out.println("");
            }
        }
    }
