package level15;

import java.io.*;

public class b17103 {
    static boolean isPrime(int n){
        boolean isPrime = true;
        int temp = 2;
        if(n == 2|| n==3) return true;
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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t, n, count;
        t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            count = 0;
            n = Integer.parseInt(br.readLine());
            for(int j = 2; j < n/2+1; j++){
                if(isPrime(j)&&isPrime(n-j)){
                    count++;
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
