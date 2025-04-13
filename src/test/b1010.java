package test;

import java.io.*;

public class b1010 {
    static int getCount(int m, int n){
        if(n==0||n==m) return 1;
        else return getCount(m-1, n-1) + getCount(m-1,n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t, m, n;
        int[][] arr = new int[31][31];
        for(int i = 1; i < 31; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for(int i = 2; i < 31; i++){
            for(int j = 1; i-j > 0; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }


        String[] temp;
        t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            temp = br.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            bw.write(getCount(m, n)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
