package level12.b2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int n = new Scanner(System.in).nextInt();
            int min = 2000;
            int five, three;
            five= n/5;
            while(five!=-1){
                three = (n - five*5)/3;
                if(five*5+three*3==n){
                    if(five+three<min){
                        min = five+three;
                    }
                }
                five--;
            }
            if(min==2000){
                System.out.print(-1);
            }
            else System.out.print(min);
        }
}
