package baekjoon.level16;

import java.util.Scanner;

public class b11866 {
    static class Josephus{
        int[] queue;
        int front;
        int rear;
        int size;
        int k;

        Josephus(int n, int k){
            queue = new int[n+1];
            front = 0;
            rear = 0;
            size = n+1;
            this.k = k;
            for(int i = 0; i < size; i++){
                queue[i] = i+1;
            }
        }

        private boolean isEmpty(){
            return (front+1)%size==rear;
        }


        private boolean isFull(){
            return rear==front;
        }

        int pop(){
            if(!isEmpty()){
                int temp = queue[front];
                front++;
                if(front==size){
                    front=0;
                }
                return temp;
            }
            else return -1;
        }

        void push(int x){
            if(!isFull()){
                queue[(rear-1+size)%size] = x;
                rear++;
                if(rear==size){
                    rear = 0;
                }
            }
        }

        void print(){
            int temp = 1;
            for(int i = 0; i < k-1; i++){
                push(pop());
            }
            System.out.print("<"+pop());
            while(!isEmpty()){
                if(temp%k==0){
                    System.out.print(", " +pop());
                }
                else{
                    push(pop());
                }
                temp++;
            }
            System.out.print(">");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        Josephus j = new Josephus(n, k);
        j.print();
    }
}
