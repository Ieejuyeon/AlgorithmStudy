package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class b1463 {

    static void recursive(int x, int value){
        if (visited[x]&&count[x]<value){
            return;
        }
        else {
            visited[x] = true;
            count[x] = value;
            if(x<2) return;
            else{
                if(x%3==0) recursive(x/3, value+1);
                if(x%2==0) recursive(x/2, value+1);
                recursive(x-1, value+1);
            }
        }
    }

    static int[] count;
    static boolean[] visited;
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        count = new int[x+1];
        visited = new boolean[x+1];
        recursive(x, 0);
        System.out.println(count[1]);
    }
}
