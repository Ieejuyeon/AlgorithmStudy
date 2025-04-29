package baekjoon.level7;

import java.io.IOException;

public class b10798 {
    public static void main(String[] args) throws IOException {
        //Scanner의 next(nextInt)와 nextLine의 차이 :
        //nextLine은 개행문자 전까지 가져오고 개행문자를 지우는데, (줄바꿈기준)
        //next는 개행문자를 버퍼에 버리고 가져온다. (공백기준)

        //이번 문제에서는 개행문자를 사용할 것임으로
        //Scanner가 아닌 System.in.read()메소드를 사용하였다.
        char[][] words = new char[5][15];
        for(int i = 0; i < 5; i++) {
            int k = 0;
            char c;
            c = (char) System.in.read();
            while(c != '\n') {
                words[i][k++] = c;
                c = (char) System.in.read();
            }
        }
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 5; j++){
                //'\u0000' = char 초기값
                if(words[j][i]=='\u0000'){
                    continue;
                }
                System.out.print(words[j][i]);
            }
        }
    }
}
