package baekjoon.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        int count = 0;

        String s;
        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(s.equals("ENTER")) {
                set = new HashSet<>();
            }
            else if(!set.contains(s)){
                    count++;
                    set.add(s);

            }
        }
        System.out.print(count);

    }
}
