package level10.b1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, w, h;
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        int min = x;
        if(min > y) min = y;
        if(min > w-x) min = w-x;
        if(min > h-y) min = h-y;

        System.out.print(min);
    }
}
