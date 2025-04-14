package level16;

import java.util.Scanner;

public class b9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        int count;
        boolean isVPS;
        for(int i =0;i < t; i++){
            s = sc.next();
            count = 0;
            isVPS = true;
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)=='(') count++;
                else count--;
                if(count==-1){
                    isVPS = false;
                    break;
                }
            }
            if(count!=0) isVPS = false;
            if(isVPS){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
