package level15;

import java.io.*;

public class b1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t, a, b;
        String[] temp;
        t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            temp = br.readLine().split(" ");
            a = Integer.parseInt(temp[0]);
            b = Integer.parseInt(temp[1]);
        }

    }
}
