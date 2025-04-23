package baekjoon.level15;

import java.io.*;

public class b1929 {
    static boolean prime(int n){
        if(n==2||n==3) return true;
        else if(n==1) return false;
        int temp=2;
        boolean isPrime = true;
        while(temp*temp<=n){
            if(n%temp==0){
                isPrime = false;
                break;
            }
            temp++;
        }
        return isPrime;
    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m, n;
        String[] s= br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]);

        for(int i = m; i < n+1; i++){
            if(prime(i)){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
