package baekjoon.level15;

import java.io.*;
import java.util.*;

public class b2485 {
    static int GCD(int a, int b){
        if(a>b) {
            if(a%b==0) return b;
            else return GCD(b, a%b);}
        else {
            if(b%a==0) return a;
            return GCD(a, b%a);}
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int temp = b-a;
        list.add(b-a);
        for(int i = 0; i < n-2; i++){
            a = b;
            b = Integer.parseInt(br.readLine());
            list.add(b-a);
            temp = GCD(temp, b-a);
        }

        int sum = 0;
        for(int i : list){
            sum += (i/temp)-1;
        }
        bw.write(sum+"");
        bw.flush();
        br.close();
        bw.close();
    }
}
