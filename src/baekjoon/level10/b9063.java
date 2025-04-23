package baekjoon.level10;

import java.util.Scanner;

public class b9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minx = sc.nextInt();
        int miny = sc.nextInt();
        int maxx = minx;
        int maxy = miny;
        int temp;
        for (int i = 1; i < n; i++){
            temp = sc.nextInt();
            if(temp<minx) minx = temp;
            if(temp>maxx) maxx = temp;
            temp = sc.nextInt();
            if(temp<miny) miny = temp;
            if(temp>maxy) maxy = temp;
        }

        System.out.print((maxx-minx)*(maxy-miny));
    }
}
