package baekjoon.level19;

import java.io.*;

public class b25501 {
    static class Tuple {
        int isPal;
        int count;
        Tuple(int isPal, int count){
            this.isPal = isPal;
            this.count = count;
        }

        @Override
        public String toString() {
            return isPal + " " + count;
        }
    }
    static Tuple recursion(String s, int l, int r, int count){
        if(l >= r) return new Tuple(1, count);
        else if(s.charAt(l) != s.charAt(r)) return new Tuple(0, count);
        else return recursion(s, l+1, r-1, count+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            s = br.readLine();
            sb.append(recursion(s, 0, s.length()-1, 1)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}