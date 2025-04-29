package baekjoon.level19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b24060 {
    static void merge_sort(int st, int end){
        if(st < end){
            int mid = (st+end)/2;
            merge_sort(st, mid);
            merge_sort(mid+1, end);
            merge(st, mid, end);
        }
    }
    static void merge(int st, int mid, int end){
        int i = st;
        int j = mid+1;
        int t = 0;
        while(i<=mid&&j<=end){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
//                System.out.println(Arrays.toString(temp));
            }
            else temp[t++] = arr[j++];
//            System.out.println(Arrays.toString(temp));
        }
        while(i<=mid)
            temp[t++] = arr[i++];
//        System.out.println(Arrays.toString(temp));
        while(j<=end)
            temp[t++] = arr[j++];
//        System.out.println(Arrays.toString(temp));
        i = st;
        t = 0;
        while(i<=end) {
            arr[i++] = temp[t++];
            count++;
            if(count==k){
                result=arr[i-1];
            };
        }
    }

    static int result=-1;
    static int k;
    static int count=0;
    static int[] temp;
    static int[] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        temp = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(0, n-1);
        System.out.println(result);
    }
}
