package level11.b24313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a0, c, n0;
        a1 = sc.nextInt();
        a0 = sc.nextInt();
        c = sc.nextInt();
        n0 = sc.nextInt();
        //a1-c가 0일 경우도 생각해야함.
        if(a1==c){
            if(a0<=0){
                System.out.print(1);
            }
            else System.out.print(0);
        }
        else if(n0<-1*a0/(a1-c))
            System.out.print(0);
        else
            System.out.print(1);

    }
}
