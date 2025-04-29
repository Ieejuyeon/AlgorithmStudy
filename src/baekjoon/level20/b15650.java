package baekjoon.level20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class b15650 {

    static void dfs(int d, int c) throws IOException {
        if(d==m){
            for(int i = 0; i < m; i++){
                bw.write((arr[i]+1)+ " ");
            }
            bw.write("\n");
        }
        else{
            for(int i = c; i < n; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[d] = i;
                    dfs(d+1, i+1);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean[] visited;
    static int[] arr;
    static int m;
    static int n;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        visited = new boolean[n];

        dfs(0,0);

        bw.flush();
        bw.close();
    }
}
