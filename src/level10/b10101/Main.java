package level10.b10101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angle = new int [3];
        for(int i = 0; i< 3; i++){
            angle[i] = sc.nextInt();
        }

        String s = "Error";
        if(angle[0]+angle[1]+angle[2]==180){
        if(angle[0]==angle[1]&&angle[1]==angle[2]){
                s= "Equilateral";
        }
        else if(angle[0]==angle[1]||angle[1]==angle[2]||angle[2]==angle[0]){
             s = "Isosceles";
        }
        else s = "Scalene";
        }

        System.out.print(s);
    }
}
