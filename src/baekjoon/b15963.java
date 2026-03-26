package baekjoon;

import java.util.Scanner;

public class b15963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String Array[] = i.split(" ");
        if(Array[0].equals(Array[1])){
            System.out.println(1);
        }
        else System.out.println(0);
    }

}
