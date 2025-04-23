package baekjoon.level14;

import java.io.*;
import java.util.*;

public class b10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, m;
        Set<String> narr = new HashSet<>();
        String s;

        n = Integer.parseInt(br.readLine());
        s = br.readLine();
        narr = new HashSet<>(List.of(s.split(" ")));

        m = Integer.parseInt(br.readLine());
        s = br.readLine();
        String[] sarr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            if(narr.contains(sarr[i]))
                    sb.append(1 + " ");
                else sb.append(0 + " ");
        }
        bw.write(sb.toString());


        bw.flush();
        bw.close();
        br.close();
    }
}
