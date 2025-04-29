package baekjoon.level19;

import java.io.*;
import java.util.Scanner;

public class b4779 {
    static void rec(int i) throws IOException {
        if(i==0) bw.write("-");
        else{
            rec(i-1);
            recBlank(i-1);
            rec(i-1);
        }
    }
    static void recBlank(int i) throws IOException {
        if(i==0) bw.write(" ");
        else {
            for(int j = 0;  j < 3; j++){
                recBlank(i-1);
            }
        }
    }
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
//        String[] sb = new String[13];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        sb[0] = "-";
//        for(int i = 1; i < 13; i++){
//            sb[i] = rec(sb[i-1]);
//        }
        String s;
        while((s = br.readLine())!=null){
            rec(Integer.parseInt(s));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
