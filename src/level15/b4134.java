package level15;

import java.io.*;

public class b4134 {
    static boolean prime (long n){
        if(n == 2 || n==3) return true;
        if(n==1 || n==0) return false;
        boolean b = true;
        long temp=2;
        while(temp*temp<=n){
            if(n%temp==0){
                b = false;
                break;
            }
            temp++;
        }
        return b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t;
        long n, temp;
        t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            n = Long.parseLong(br.readLine());
            temp = n;
            while(!prime(temp)){
                temp++;
            }
            bw.write(temp+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
