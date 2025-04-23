package baekjoon.level16;

import java.util.Scanner;

public class b12789 {
    static class Stack{
        int[] stack = new int[1000];
        int top = 0;

        boolean isBlank(){
            return (top==0);
        }

        boolean isFull(){
            return (top==1000);
        }

        void push(int n){
            if(!isFull()) {
                stack[top] = n;
                top++;
            }
        }

        boolean pop(int n){
            if(isBlank()) return false;
            if(stack[top-1]!=n) return false;
            top--;
            return true;
        }

        void print(){
            System.out.print("[ ");
            for(int i = 0; i < top; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.print("]\n");
        }

        int pick(){
            if(top==0) return -1;
            top--;
            return stack[top];
        }
    }

    static int isNice(Stack wait, Stack input, int count){
        if(!input.isBlank()){
            if(!input.pop(count)){
                if(!wait.pop(count)) {
                    wait.push(input.pick());
                    return 0;
                }
                return 1;
            }
            return 1;
        }
        else{
            if(!wait.pop(count)){
                return -1;
            }
            else return 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        int n;
        Stack input = new Stack();
        Stack wait = new Stack();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            arr[n-i-1] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
           input.push(arr[i]);
        }

        int count = 1;
        int temp = isNice(wait, input, count);
        while (temp!=-1){
//            System.out.println("count : " + count);
//            input.print();
//            wait.print();
            if(temp==1) {
                count++;
            }
            temp = isNice(wait, input, count);
        }
        if(count==n+1) System.out.println("Nice");
        else {
            System.out.println("Sad");
//            System.out.println("count : " + count);
//            input.print();
//            wait.print();
        }

    }
}
