package level15;

import java.io.*;

public class b1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t, a, b, div, min;
        a = 1;
        b = 1;
        String[] temp;
        t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            div = 1;
            temp = br.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
            for(int j = 2; j < a+1; j++){
                if(a%j == 0 && b%j == 0){
                    div = j;
                }
            }
            bw.write((a/div)*b+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
