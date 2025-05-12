package level18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2108 {
//    static int readInt() throws IOException {
//        int len = 0;
//        int[] arr = new int[5];
//        boolean isNegative=false;
//        int result = 0;
//
//        //첫 숫자 받기, 마이너스일수도 있음을 감안
//        int temp = br.read();
//        if(temp=='-') isNegative = true;
//        else arr[len++] = temp-'0';
//
//        temp = br.read();
//        while(temp!='\n'){
//            arr[len++] = temp-'0';
//            temp = br.read();
//        }
//
//        //숫자로 변환
//        int digit=1;
//        for(int i = 0; i < len; i++){
//            result += arr[len-i-1]*digit;
//            digit *= 10;
//        }
//
//        return result*(isNegative?-1:1);
//    }

    static class Number{
        int number;
        static int[] mode = new int[8001];
        static int sum;

        Number(int num){
            number = num;
            mode[num+4000]++;
            sum += num;
        }
    }
    static class numComparator implements Comparator<Number>{
        @Override
        public int compare(Number o1, Number o2) {
            if(o1.number>o2.number) return 1;
            else if(o1.number==o2.number) return 0;
            else return -1;
        }
    }
    static class modeComparator implements Comparator<Number>{
        @Override
        public int compare(Number o1, Number o2) {
            int n, m;
            n = Number.mode[o1.number+4000];
            m = Number.mode[o2.number+4000];
            if(n>m) return 1;
            else if(n<m) return -1;
            else {
                if(o1.number>o2.number) return 1;
                else if(o1.number<o2.number) return -1;
            }
            return 0;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        List<Number> list = new ArrayList<>();
//        int n = readInt();
//        for(int i = 0; i < n; i++){
//            list.add(new Number(readInt()));
//        }
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i <n; i++){
            list.add(new Number(Integer.parseInt(st.nextToken())));
        }
        float avg;
        int mid, mode, range;

        if(n==1) {
            avg = mid = mode = list.get(0).number;
            range = 0;
        }

        else {
            avg = (float) Number.sum / n;

            list.sort(new numComparator());
            mid = list.get(n / 2).number;
            range = list.get(n - 1).number - list.get(0).number;

            list.sort(new modeComparator());
            if (Number.mode[list.get(n-1).number + 4000] == Number.mode[list.get(n-2).number + 4000])
                mode = list.get(n-2).number;
            else mode = list.get(n-1).number;
        }

        System.out.printf("%.0f\n", avg);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);

        br.close();

    }
}
