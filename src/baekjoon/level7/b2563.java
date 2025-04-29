package baekjoon.level7;

import java.util.Scanner;

public class b2563 {
    //기본값 0
    //boolean이 아니라 byte형을 택한 이유는 비교연산을 줄이기 위해서이다.
    //int형은 byte형보다 크기가 커서(4byte>1byte) 사용하지않았다.
    //c에서는 boolean이 없다고 알고있지만 c99에서 stdbool라이브러리에 bool표준이 만들어져있다.
    static byte[][] white = new byte [100][100];

    static void color(int x, int y){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                white[x+i][y+j] = 1;
            }
        }
    }

    static int getSum(){
        int count = 0;
        for(int i = 0; i < 100; i++)
            for(int j = 0; j < 100; j++){
                count += white[i][j];
            }
        return count;
    }

    //static 메소드에서 다른 메소드를 사용할때 static 메소드만 가능한 이유 정리하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            color(sc.nextInt(), sc.nextInt());
        }

        System.out.print(getSum());
    }
}
