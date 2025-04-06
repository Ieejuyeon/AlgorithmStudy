package level13.b11650;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        int[][] num;
        int[] temp;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        num = new int[n][2];
        temp = new int[2];
        String s;

        for(int i = 0; i < n; i++){
            s = br.readLine();
            num[i][0] = Integer.parseInt(s.split(" ")[0]);
            num[i][1] = Integer.parseInt(s.split(" ")[1]);
        }

        for(int i =0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if((num[j][0] > num[j+1][0])||(num[j][0]==num[j+1][0]&&num[j][1]>num[j+1][1])){
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            bw.write(num[i][0] + " " + num[i][1] + "\n");
        }

        bw.flush();
        br.close();
        bw.flush();
    }
}
