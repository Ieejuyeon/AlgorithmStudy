package homework.week11;

import java.io.*;
import java.util.*;

public class b1157_2 {
    static class Tuple implements Comparable<Tuple>{
        char c;
        int count;
        Tuple(int i){
            c = (char)(i+'A');
            count = 0;
        }
        @Override
        public int compareTo(Tuple t) {
            if(count>t.count) return 1;
            else if(count ==t.count) return 0;
            return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        int size = 'Z'-'A'+1;
        Tuple[] t = new Tuple[size];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i<size; i++){
            t[i] = new Tuple(i);
        }

        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        char[] c = s.toCharArray();
        int index;
        for(int i = 0; i<s.length();i++){
            index = (c[i]-'A')%('a'-'A');
            t[index].count++;
        }
        Arrays.sort(t);

        if(t[size-1].compareTo(t[size-2])==0){
            bw.write("?");
        }
        else bw.write(t[size-1].c+"");

        bw.flush();
        bw.close();
    }
}
