package baekjoon.level16;

import java.io.*;

public class b28278 {
    static class Stack{
        int[] stack;
        int top;
        int size;

        Stack(int size){
            stack = new int[size];
            this.size = size;
            top = 0;
        }

        void func1(int x){
            stack[top++] = x;
        }

        void func2(){
            if(top==0) System.out.println(-1);
            else System.out.println(stack[--top]);
        }

        void func3(){
            System.out.println(top);
        }

        void func4(){
            if(top==0) System.out.println(1);
            else System.out.println(0);
        }

        void func5(){
            if(top==0) System.out.println(-1);
            else System.out.println(stack[top-1]);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack s = new Stack(1000000);
        int n = Integer.parseInt(br.readLine());
        String[] temp;
        for(int i =0; i<n; i++){
            temp = br.readLine().split(" ");
            switch(temp[0]){
                case "1" :
                    s.func1(Integer.parseInt(temp[1]));
                    break;
                case "2" :
                    s.func2();
                    break;
                case "3" :
                    s.func3();
                    break;
                case "4" :
                    s.func4();
                    break;
                default :
                    s.func5();
            }

        }
    }
}
