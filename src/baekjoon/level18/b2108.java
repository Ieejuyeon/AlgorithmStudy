package baekjoon.level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2108{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Map<Integer, Integer> modeList = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] modeList = new int[8001];
        List<Integer> numList = new ArrayList<>();
        Integer[] num = new Integer[n];
        int input;
        double sum = 0;
        for(int i = 0; i < n; i++){
            input = Integer.parseInt(br.readLine());
            num[i] = input;
            numList.add(input);
            modeList[input+4000]++;
            sum += input;
        }

        int avg, mid, mode, range;


        int maxMode = 0;
        int first = 8001;
        int second = 8001;
        for(int i = 0; i < 8001;i ++){
            if(modeList[i] > maxMode) {
                maxMode = modeList[i];
                first = i;
                second = 8001;
            }
            else if(modeList[i]==maxMode){
                if(first>i){
                    second = first;
                    first = i;
                }
                else if(second>i){
                    second = i;
                }
            }
        }
        if(second==8001) mode = first-4000;
        else mode = second-4000;

        Collections.sort(numList);
        range = numList.get(n-1) - numList.get(0);
        mid = numList.get(n/2);

        avg = (int) Math.round(sum/n);
        System.out.println(avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}