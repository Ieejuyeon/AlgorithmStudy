package level14;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class b11478 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length()+1; j++){
                set.add(s.substring(i, j));
            }
        }

        bw.write(set.size()+"");

        bw.flush();
        br.close();
        bw.close();

    }
}
