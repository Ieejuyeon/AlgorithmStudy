package baekjoon.level14;

import java.io.*;
import java.util.*;

public class b1764 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;

        //입력
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        Set<String> nSet = new HashSet<>();
        Set<String> mSet = new HashSet<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            nSet.add(br.readLine());
        }
        for(int i = 0; i < m; i++){
            mSet.add(br.readLine());
        }

        //중복값 검사
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(String i : mSet){
            if(nSet.contains(i)){
                count++;
                result.add(i);
            }
        }

        //출력
        Collections.sort(result);
        bw.write(count + "\n");
        for(String i : result){
            bw.write(i + "\n");
        }


        bw.flush();
        br.close();
        bw.close();
    }
}
