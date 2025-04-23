package baekjoon.level15;

import java.io.*;

public class b1735 {

    static int gcd(int b1, int b2){
        if(b1%b2==0)
            return b2;
        else return gcd(b2, b1%b2);
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1, b1, a2, b2, a, b, gcd, temp;
        String[] str = br.readLine().split(" ");
        a1 = Integer.parseInt(str[0]);
        b1 = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        a2 = Integer.parseInt(str[0]);
        b2 = Integer.parseInt(str[1]);

        if(b1<b2) {
            temp = b1;
            b1 = b2;
            b2 = temp;
            temp = a1;
            a1 = a2;
            a2 = temp;
        }

        gcd = gcd(b1,b2);
        a1 = a1*(b2/gcd);
        a2 = a2*(b1/gcd);
        a = a1+a2;
        b = b1/gcd*b2;

        if(a>b) gcd = gcd(a, b);
        else gcd = gcd(b, a);
        a = a/gcd;
        b = b/gcd;

        bw.write(a+ " " + b);




        bw.flush();
        bw.close();
        br.close();
    }
}
