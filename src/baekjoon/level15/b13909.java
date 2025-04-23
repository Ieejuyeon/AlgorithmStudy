package baekjoon.level15;

import java.io.*;

public class b13909 {

    //홀수번 열고닫아지면 1
    //근데 n번째 창문이 홀수번 열고 닫아진다(1이다)는 것은 그 약수가 홀수개라는것
    //약수가 홀수이려면 i*i==n을 만족하는 i가 있어야함
    //그래서 i*i<=n까지 가능한 i의 개수가 열린 창문의 갯수
    static int mul(int n){
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;
        n = Integer.parseInt(br.readLine());

        bw.write(mul(n)+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
