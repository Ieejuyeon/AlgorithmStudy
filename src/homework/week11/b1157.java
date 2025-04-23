package homework.week11;

import java.io.*;
import java.util.Arrays;

public class b1157 {
    public static void main(String[] args) throws IOException {
        int size = 'z'-'a'+1;
        int[] count = new int[size];
        String s =  new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 'a' - 'A';
        for(int i = 0; i < s.length(); i++ ){
            count[((s.charAt(i))-'A')%n]++;
        }
        int maxValue = 0;
        int maxIndex = 0;
        boolean same = true;
        for(int i = 0; i < size; i++){
            if(count[i]>maxValue){
                maxValue = count[i];
                maxIndex = i;
                same = false;
            }
            else if(count[i]==maxValue){
                same = true;
            }
        }
        if(same) bw.write("?");
        else bw.write((char)(maxIndex+'A')+"");
        bw.flush();
        bw.close();
    }
}
