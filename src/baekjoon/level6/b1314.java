package baekjoon.level6;

import java.util.Scanner;

public class b1314 {
    // 이미 존재하는 알파벳인지 나타내는 배열
    static int count = 0;

    //그룹단어면 1, 아니면 0 반환
    static int isGroupWord(String s){
        // 클래스 변수나 인스턴스 변수만 초기화 된다는데 이거 지역변수 아닌가?
        boolean[] isExistChar = new boolean['z'-'a'+1];

        //첫글자 처리, c는 비교할 문자
        char c = s.charAt(0);
        isExistChar[c-'a'] = true;
        //두번째 글자부터
        for(int i = 1; i < s.length(); i++){
            //이전 글자랑 다르면
            if(s.charAt(i)!=c){
                //이미 있는 알파벳이면 0 반환
                if(isExistChar[s.charAt(i)-'a']){
                    return 0;
                }
                //없는 알파벳이면 배열값을 바꾸고, 비교할 문자를 현재 문자로 변경
                else {
                    isExistChar[s.charAt(i)-'a'] = true;
                    c = s.charAt(i);
                }
            }
        }

        //끝까지 검토했을 때 이미 있는 알파벳이 다시 나오지 않으면 1반환
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            count += isGroupWord(sc.next());
        }

        System.out.println(count);
    }

}
