package homework.week12;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class b2309 {
    static int sum(ArrayList<Integer> heights, int n, int m){
        int sum = 0;
        for(int i = 0; i < 9; i++){
            sum += heights.get(i);
        }
        sum -= heights.get(n);
        sum -= heights.get(m);
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> heights = new ArrayList<>();
        for(int i = 0 ; i < 9; i++){
            heights.add(Integer.parseInt(br.readLine()));
        }
        heights.sort(Comparator.naturalOrder());

        int k = 0;
        while(k!=81){
            int i = k/9;
            int j = k%9;
            if(sum(heights, i, j)==100){
                heights.remove(i);
                heights.remove(j-1);
                break;
            }
            k++;
        }

        for(int i : heights){
            bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}