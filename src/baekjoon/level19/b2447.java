package baekjoon.level19;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class b2447 {
    static void print(int st, int end, int count) {
        if(count==1){
            s[st].append("*");
        }
        else{
//            for(int i = 0; i < 3; i++){
                print(st, count/3, count/3);
                print(st, count/3, count/3);
                print(st, count/3, count/3);
                print(st+count/3, count/3*2, count/3);
                printBlank(st+count/3, count/3*2, count/3);
                print(st+count/3, count/3*2, count/3);
                print(st+count/3*2, end, count/3);
                print(st+count/3*2, end, count/3);
                print(st+count/3*2, end, count/3);
//            }
        }
    }
    static void printBlank(int st, int end, int count){
//        if(count==1) {
//            s[st].append(" ");
//        }
//        else{
//            printBlank(st, count/3, count/3);
//            printBlank(st+count/3, count/3*2, count/3);
//            printBlank(st+count/3*2, end, count/3);
//        };
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count; j++){
                s[st+i].append(" ");
            }
        }
    }

    static StringBuilder[] s;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = new Scanner(System.in).nextInt();
        s = new StringBuilder[n];
        for(int i =0; i < n; i ++){
            s[i] = new StringBuilder();
        }

        print(0, n, n);
        for(int i = 0; i < n; i++){
            bw.write(s[i].toString()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
