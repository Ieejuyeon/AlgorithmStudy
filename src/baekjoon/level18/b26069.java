package baekjoon.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        String[] s = new String[2];
        for(int i = 0; i < n; i++){
            s = br.readLine().split(" ");
            if(set.contains(s[0])){
                set.add(s[1]);
            }
            else if(set.contains(s[1])) set.add(s[0]);
        }
        System.out.println(set.size());
    }
}
