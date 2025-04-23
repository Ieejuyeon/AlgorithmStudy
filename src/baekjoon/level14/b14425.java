package baekjoon.level14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class b14425 {
    public static void main(String[] args) throws IOException {
        int n, m, count;
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        count = 0;
        String[] s = br.readLine().split(" ");

        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);

        for(int i = 0; i < n; i++){
            set.add(br.readLine());
        }
        for(int i = 0; i < m; i++){
            if(set.contains(br.readLine())){
                count++;
            }
        }
        bw.write(count+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
