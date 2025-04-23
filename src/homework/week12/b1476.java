package homework.week12;
import java.util.Scanner;

// E, S, M이 1로 돌아온 횟수를 a, b, c라고 할 때 n = 15*a + E = 28*b + S = 19*c =M

public class b1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E, S, M;
        E = sc.nextInt();
        S = sc.nextInt();
        M = sc.nextInt();
        int n=S;
        while((n-M)%19!=0||(n-E)%15==0){
            n += 28;
        }
        System.out.println(n);

    }
}
