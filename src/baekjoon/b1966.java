package baekjoon;

import java.util.Scanner;

public class b1966 {
    public static class Queue {
        int[] que;
        int front;
        int rear;
        int n;

        public Queue(int n){
            que = new int[n];
            front = 0;
            rear = n-1;
            this.n = n;
        }

        public void push(int v){
            rear = (rear+1)%n;
            que[rear] = v;
            System.out.println("push: "+v);
            print();
        }

        public int pop(){
            int tmp = que[front];
            front = (front+1)%n;
            System.out.println("pop: "+tmp);
            print();
            return tmp;
        }

        public void print(){
            for(int i = 0; i < n; i++)
                System.out.print(que[i]+" ");
            System.out.println();
        }

        public void doPrint(){
            for(int i = 9;i > 0; i--){

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){

        }
    }
}
