package level7.b2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int temp;
        int location = 0;
        for(int i = 1; i < 81; i++){
            temp = sc.nextInt();
            if(temp>max){
                max = temp;
                location = i;
            }
        }
        System.out.println(max);
        System.out.print(location/9+1 + " " + (location%9 + 1));
    }
}
