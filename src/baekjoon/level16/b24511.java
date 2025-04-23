package baekjoon.level16;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer struct = new StringTokenizer(br.readLine());
        StringTokenizer structInput = new StringTokenizer(br.readLine());
        int resultCount = Integer.parseInt(br.readLine());
        StringTokenizer newInput = new StringTokenizer(br.readLine());

        int queueCount = 0;
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            if(struct.nextToken().equals("0")){
                arr[queueCount]=Integer.parseInt(structInput.nextToken());
                queueCount++;
            }
            else structInput.nextToken();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < resultCount&&i<queueCount; i++){
            sb.append(arr[queueCount-i-1]).append(" ");
        }
        for(int i = 0; i < resultCount-queueCount; i++){
            sb.append(newInput.nextToken()).append(" ");
        }

        bw.write(sb+"");

        br.close();
        bw.flush();
        bw.close();

    }
}
