package level15;

import java.io.*;

public class b13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long a, b, r, temp, gcd, aTemp, bTemp;
        String[] strings = br.readLine().split(" ");
        a = Long.parseLong(strings[0]);
        b = Long.parseLong(strings[1]);
        aTemp = a;
        bTemp = b;

        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        gcd = b;
        r = a%b;

        while(r!=0){
            gcd = r;
            a = b;
            b = r;
            r = a%b;
        }

        bw.write(aTemp/gcd*bTemp+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
