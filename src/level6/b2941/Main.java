package level6.b2941;

import java.util.Scanner;

public class Main {
    public static int count(char c1, char c2, char c3) {
        if(c1=='c'){
            if(c2=='='||c2=='-'){
                return -1;
            }
        }

        else if(c1=='d'){
            if(c2=='z'&&c3=='='){
                return -1;
            }
            else if(c2=='-'){
                return -1;
            }
        }

        else if(c1=='l'&&c2=='j'){
            return -1;
        }

        else if(c1=='n'&&c2=='j'){
            return -1;
        }

        else if(c1=='s'&&c2=='='){
            return -1;
        }

        else if(c1=='z'&&c2=='='){
            return -1;
        }

        return 0;
    }

    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next() + "00";
        int answer = s.length()-2;

        for(int i = 0; i < s.length()-2; i++){
            answer += count(s.charAt(i), s.charAt(i+1), s.charAt(i+2));
        }

        System.out.println(answer);
    }

}
