package level13.b1427;

import java.io.*;

public class Main {
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
