package baekjoon.level20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class b15649 {
    // curr : 현재 남아있는 숫자
    // index : 저장할 인덱스
    // val : 현재 저장할 인덱스 뜻하는 숫자
    // h : 나누고 있는 숫자
//    static void intToArray(int n, int m, int curr, int w, int h, int val){
//        arr[h][w] = curr/val;
//        if(val==1){
//            if(h!=max-1) intToArray(n, m, h+1, 0, h+1, max/n);
//        }
//        else intToArray(n, m, curr%val, w+1, h, val/n);
//    }

    static Set<Integer> set = new HashSet<>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        StringBuilder sb= new StringBuilder();

        int i =0;
        while(i>=n){

        }


        long endTime = System.currentTimeMillis(); // 종료 시간
        long elapsedTime = endTime - startTime; // 걸린 시간 (ms 단위)
        System.out.println(elapsedTime);

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
