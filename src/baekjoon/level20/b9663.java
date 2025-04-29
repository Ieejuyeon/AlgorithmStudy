package baekjoon.level20;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class b9663 {
    //d번째 체스말을 i부터 n*n-1까지 두는 def
    static void dfs(int d, int i) throws IOException {
        if(d==n-1){
            count++;
        }
        else{
            // 체스말을 2, 1, 3에 놓든 1, 2, 3에 놓든 결과는 같다
            // = 순서 상관 없으니깐 오름차순(i+1)로 선택
            int temp = 0;
            boolean found = false;
            // 처음 dfs(0,0)은 0부터 n*n-1개 까지의 경우의 수를 해봐야함
            temp = getRid(i/n, i%n);
            //possible 할때만 dfs 개수를 쳐줘야함.
            for(int l = i+1; l < n*n; l++){
                if(possible[l/n][l%n]==-1){
                    dfs(d+1, l);
                    found = true;
                }
            }
            getBack(temp);
            // 다음 k를 실행할 때는(다음 경우의 수를 실행할 때는)
            // 원래 상태여야하므로 되돌려주는것도 for 문안에
        }
    }


    static int getRid(int i, int j){
        int result = 0;
        if(possible[i][j]!=-1) return 0;
        else{
            for(int k = 0; k < n; k++){
                if(possible[i][k]==-1){
                    possible[i][k] = i*n+j;
                    result++;
                    stack.push((i*n)+k);
                }
                if(possible[k][j]==-1){
                    possible[k][j] = i*n+j;
                    result++;
                    stack.push((k*n)+j);
                }
            }
            int a = i-1;
            int b = j-1;
            while(a>-1&&b>-1){
                if(possible[a][b]==-1){
                    possible[a][b]=i*n+j;
                    result++;
                    stack.push((a*n)+b);
                }
                a--;
                b--;
            }
            a = i-1;
            b = j+1;
            while(a>-1&&b<n){
                if(possible[a][b]==-1){
                    possible[a][b]=i*n+j;
                    result++;
                    stack.push((a*n)+b);
                }
                a--;
                b++;
            }
            a = i+1;
            b = j-1;
            while(a<n&&b>-1){
                if(possible[a][b]==-1){
                    possible[a][b]=i*n+j;
                    result++;
                    stack.push((a*n)+b);
                }
                a++;
                b--;
            }
            a = i+1;
            b = j+1;
            while(a<n&&b<n){
                if(possible[a][b]==-1){
                    possible[a][b]=i*n+j;
                    result++;
                    stack.push((a*n)+b);
                }
                a++;
                b++;
            }

            return result;
        }
    }

    static void getBack(int count){
        int pos;
        for(int i = 0; i < count; i++){
            pos = stack.pop();
            possible[pos/n][pos%n] = -1;
        }
    }

    static class Stack{
        int[] stack;
        int top;
        Stack(int n){
            stack = new int[n*n];
            top = 0;
        }
        void push(int x){
            stack[top++] = x;
        }
        int pop(){
            return stack[--top];
        }
        boolean isFull(){
            return top==n*n;
        }
    }

    static void print() throws IOException {
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                bw.write(possible[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write("\n");
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;
    static int n;
    // 가린 숫자
    static Stack stack;
    // 몇 개 가렸는지
//    static Stack stackCount;
    static int[][] possible;
    public static void main(String[] args) throws IOException {
        n = new Scanner(System.in).nextInt();
        stack = new Stack(n);
//        stackCount = new Stack(n*n);
        possible = new int[n][n];
        for(int i =0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                possible[i][j] = -1;
            }
        }
        for(int i =0 ; i < n*n; i++){
            dfs(0, i);
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }
}
