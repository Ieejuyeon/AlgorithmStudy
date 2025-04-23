package baekjoon.level6;

import java.util.Scanner;

public class b10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word;
        word = sc.next();
        boolean pal = true;

        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1))
                pal = false;
        }
        if(pal)
            System.out.println('1');
        else System.out.println('0');
    }
}
