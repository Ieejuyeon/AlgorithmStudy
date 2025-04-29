package baekjoon.level20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class b15651 {
    static void dfs(int d, int c) throws IOException {
        if(d==m){
            for(int i : arr){
                bw.write((i+1) + " ");
            }
            bw.write("\n");
        }

        else{
            for(int i = c; i < n; i++){
                arr[d] = i;
                dfs(d+1, i);
            }
        }
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int arr[];
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        dfs(0,0);
        bw.flush();
        bw.close();
    }
}
