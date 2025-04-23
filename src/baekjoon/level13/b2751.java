package baekjoon.level13;

import java.io.*;
import java.util.*;

public class b2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> v = new LinkedList<>();
        for(int i = 0; i < n; i++){
            v.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        Collections.sort(v);
        for(int i : v){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
