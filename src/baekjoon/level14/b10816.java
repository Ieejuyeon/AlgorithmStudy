package baekjoon.level14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class b10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n, m, key;
        String[] temp;
        Map<Integer, Integer> map = new HashMap<>();

        n = Integer.parseInt(br.readLine());
        temp = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            key =Integer.parseInt(temp[i]);
            if(map.containsKey(key)){
                map.replace(key, map.get(key)+1);
            }
            else map.put(key, 1);
        }

        m = Integer.parseInt(br.readLine());
        temp = br.readLine().split(" ");
        for(int i = 0; i < m; i++){
            key =Integer.parseInt(temp[i]);
            if(map.containsKey(key)){
                bw.write(map.get(key)+" ");
            }
            else bw.write("0 ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
