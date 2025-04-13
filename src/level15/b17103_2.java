package level15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class b17103_2 {
    public static void main(String[] args) {
        int listSize = 500000;
        boolean[] list = new boolean[listSize];
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i < listSize; i++) {
            list[i] = true;
        }
        int temp;
        for (int i = 2; i < listSize; i++) {
            temp = 2;
            if (list[i]) {
                while (temp * i < listSize) {
                    list[temp*i] = false;
                    temp++;
                }
            }
        }

        for(int i = 2; i < listSize; i++){
            if(list[i])
                primes.add(i);
        }


    }
}
