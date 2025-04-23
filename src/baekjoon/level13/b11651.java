package baekjoon.level13;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class b11651 {
    public static class Tuple implements Comparable<Tuple>{
        int x;
        int y;
        public Tuple(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Tuple o) {
            if(this.y > o.y || (this.y==o.y &&this.x > o.x)) return 1;
            else return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] s;

        ArrayList<Tuple> tuples = new ArrayList<>();
        for(int i = 0; i < n; i++){
            s = br.readLine().split(" ");
            tuples.add( new Tuple(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
        }

        Collections.sort(tuples);

        for(int i = 0; i < n; i++){
            bw.write(tuples.get(i).x + " " + tuples.get(i).y + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
