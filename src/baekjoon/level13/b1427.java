package baekjoon.level13;

import java.io.*;

public class b1427 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;

        n = br.readLine();
        int[] num = new int[10];

        for(int i = 0; i < n.length(); i++){
            num[n.charAt(i)-48]++;
        }

        for(int i = 9; i > -1; i--){
            for(int j = 0; j < num[i]; j++){
                bw.write(i+"");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
