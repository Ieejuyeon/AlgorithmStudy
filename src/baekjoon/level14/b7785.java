package baekjoon.level14;

import java.io.*;
import java.util.*;

public class b7785 {
    public static void main(String[] args) throws IOException {
        int n;
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s;

        n = Integer.parseInt(br.readLine());
        for(int i = 0; i< n; i ++){
            s = br.readLine().split(" ");
            if(s[1].equals("enter")){
                set.add(s[0]);
            }
            else set.remove(s[0]);
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            bw.write(list.get(list.size()-1-i)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
