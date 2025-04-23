package baekjoon.level18;

import java.io.*;
import java.util.*;

public class b20920 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> words = new HashMap<>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        String s;
        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(s.length()>=m){
                if(words.containsKey(s)){
                    words.replace(s, words.get(s)+1);
                }
                else words.put(s, 1);
            }
        }

        List<String> list = new ArrayList<>(words.keySet());
        Collections.sort(list, (o1, o2)->{
            if(words.get(o1)<words.get(o2)) return 1;
            else if (words.get(o1)>words.get(o2)) return -1;
            else {
                if (o1.length()>o2.length()) return -1;
                else if(o1.length()<o2.length()) return 1;
                else {
                    return o1.compareTo(o2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s1 : list){
            sb.append(s1+"\n");
        }

        bw.write(sb+"");
        bw.flush();
        br.close();
        bw.close();

    }
}
