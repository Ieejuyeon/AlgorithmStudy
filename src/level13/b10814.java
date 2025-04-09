package level13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class b10814 {
    static class Tuple implements Comparable<Tuple> {
        int age;
        String name;
        Tuple(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Tuple o) {
            return Integer.compare(this.age, o.age);
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
            tuples.add(new Tuple(Integer.parseInt(s[0]),s[1]));
        }

        Collections.sort(tuples);

        for(int i =0; i < n; i++){
            bw.write(tuples.get(i).age + " " + tuples.get(i).name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
