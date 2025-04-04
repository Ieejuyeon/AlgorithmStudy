package level10.b5073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        String s;
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        while(a+b+c!=0){

            if(a>=b+c||b>=a+c||c>=a+b){
                s = "Invalid";
            }
            else{
                if(a==b&&b==c){
                    s = "Equilateral";
                }
                else if(a==b||b==c||c==a)
                    s = "Isosceles";
                else s = "Scalene";
            }

            System.out.println(s);
            a= sc.nextInt();
            b= sc.nextInt();
            c= sc.nextInt();
        }
    }
}