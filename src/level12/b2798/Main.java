package level12.b2798;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, max, temp;
        Vector<Integer> cards = new Vector<>();
        n = sc.nextInt();
        m = sc.nextInt();
        max = 0;
        for(int i = 0; i < n; i++){
            cards.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j ++){
                for(int k = j+1; k < n; k++){
                    temp = cards.get(i) + cards.get(j) + cards.get(k);
                    if(temp>max&&temp<=m){
                        max = temp;
                    }
                }
            }
        }
        System.out.print(max);

    }
}
