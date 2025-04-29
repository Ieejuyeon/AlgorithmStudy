package baekjoon.level19;

import java.io.*;

public class b11729 {
    static class Stack{
        int[] stack;
        int top;
        Stack(int n){
            stack = new int[n];
            top=0;
        }
        void push(int x){
            stack[top++] = x;
        }
        int pop(){
            return stack[--top];
        }
        int getTop(){
            return stack[top-1];
        }
        boolean isEmpty(){
            return top==0;
        }
    }
    static void moving(int number, int current, int target) throws IOException {
        int t2 = 0;
        if(current==0){
            if(target==1)
                t2 = 2;
            else t2 = 1;
        }
        else if(current==1){
            if(target==2)
                t2 = 0;
            else t2 = 2;
        }
        else if(current==2){
            if(target==0)
                t2 = 1;
            else t2 = 0;
        }

        if(top[current].getTop()==number){
            top[target].push(top[current].pop());
            sb.append(current+1 + " " + (target+1) + "\n");
            count++;
        }
        else{
            moving(number-1, current, t2);
            top[target].push(top[current].pop());
            sb.append(current+1+ " "+ (target+1) + "\n");
            count++;
            moving(number-1, t2, target);
        }
    }
    static void back(int current, int target){

    }
    static void print() throws IOException {
        for(int i =0; i < 3; i++){
            bw.write("Stack" + i+1 + " : ");
            for(int j = 0; j < top[i].top; j++){
                bw.write(top[i].stack[j]+" ");
            }
            bw.write("\n");
        }
    }

    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    static Stack[] top = new Stack[3];
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < 3; i++){
            top[i] = new Stack(n);
        }

        for(int i = 0; i < n; i++){
            top[0].push(n-i);
        }

        moving(n, 0, 2);
        bw.write(count + "\n");
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
