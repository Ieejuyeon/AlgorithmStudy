package baekjoon.level15;

import java.io.*;

public class b4948 {
    static boolean isPrime(int n){
        boolean isPrime = true;
        int temp = 2;
        if(n == 2 || n == 3) return true;
        if(n == 1) return false;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count;
        while(n!=0){
            count = 0;
            for(int i = n+1; i < 2*n+1 ; i++){
                if(isPrime(i)) count++;
            }
            bw.write(count+"\n");
            n = Integer.parseInt(br.readLine());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
