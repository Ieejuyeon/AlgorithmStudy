package level13;

import java.io.*;
import java.util.*;

public class b18870 {
    static class Tuple{
        int x;
        int x_;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();

        int temp;
        for(int i = 0; i < n; i ++){
            temp = br.read()-'0';
            s.add(temp);
            a.add(temp);
        }

        ArrayList<Integer> s1 = new ArrayList<>(s);
        Collections.sort(s1);

        int j = 0;
        for(int k : s1){
            bw.write(k+" ");
            if(!map.containsKey(k)){
                map.put(k, j++);
            }
        }

        for(int i = 0; i < n; i++){
            bw.write(map.get(a.get(i))+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
