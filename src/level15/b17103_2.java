package level15;

import java.io.*;

public class b17103_2 {
    public static void main(String[] args) throws IOException {
        int listSize = 1000001;
        boolean[] list = new boolean[listSize];
        for (int i = 2; i < listSize; i++) {
            list[i] = true;
        }
        for (int i = 2; i*i < listSize; i++) {
            if(list[i]){
                for(int j = i*i; j < listSize; j += i){
                    list[j] = false;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, n, count;
        t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            count = 0;
            n = Integer.parseInt(br.readLine());
            for(int j =2; j < n/2+1; j++){
                if(list[j]&&list[n-j]){
                    count++;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
