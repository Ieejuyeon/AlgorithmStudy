package baekjoon.level14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class b1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, m, count;
        String[] temp;
        Set<Integer> set = new HashSet<>();

        //입력
        count = 0;
        temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);

        temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            set.add(Integer.parseInt(temp[i]));
        }

        temp = br.readLine().split(" ");
        for(int i = 0; i < m; i++){
            if(set.contains(Integer.parseInt(temp[i]))){
                count++;
            }
        }

        bw.write((n + m - count*2) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
