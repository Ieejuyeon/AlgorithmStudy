package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int five, two;
        two = 0;
        five = 0;
        boolean find = false;
        for(int i = 0; i < n/2+1; i++){
            two = i;
            five = (n-two*2)/5;
            if(two*2+five*5==n){
                find = true;
                break;
            }
        }
        if(find){
            System.out.print(two+five);
        }
        else System.out.print(-1);
    }
}
