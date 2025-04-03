package programmers.p_package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(sol()+"");
    }

    public static int sol(){
        Scanner sc = new Scanner(System.in);
        int n, num, w;
        n = sc.nextInt();
        w = sc.nextInt();
        num = sc.nextInt();

        int levelNum = (num-1)/w;
        int levelN = (n-1)/w;
        int level = levelN -levelNum;
        System.out.println(level);

        if(w==1){
            return n;
        }


        if(level%2==0){
            System.out.println("A");
            return (n-num)/w+1;
        }
        else {
            int boxNum = ((num-1)/w+1) * w -num +1;
            int boxN = n%w;
            if(boxN>=boxNum) {
                System.out.println("B");
                return level+1;}
            else {
                System.out.println("C");
                return level;}
        }
    };
}
