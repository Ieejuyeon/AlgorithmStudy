package baekjoon.level16;

import java.io.*;

public class b18258 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static class Queue{
        private int[] queue;
        private int front;
        private int back;
        private int size;

        Queue(int n){
            queue = new int[n];
            front = 0;
            back = 0;
            size = n;
        }

        private boolean isEmpty(){
            return front == back;
        }

        private boolean isFull(){
            if(back> front)
                return back-front==size;
            else return (front-back)==size;
        }

        void push(int x){
            if(!isFull()){
                queue[back] = x;
                back++;
                if(back>size){
                    back = back%size;
                }
            }
        }

        void pop() throws IOException {
            if(!isEmpty()){
                bw.write(queue[front]+"\n");
                front++;
            }
            else bw.write(-1+"\n");
        }

        void size() throws IOException {
            if(back>front){
                bw.write(back-front+"\n");
            }
            else bw.write(front-back+"\n");
        }

        void empty() throws IOException {
            if(isEmpty()){
                bw.write(1+"\n");
            }
            else bw.write(0+"\n");
        }

        void front() throws IOException {
            if(isEmpty()){
                bw.write(-1+"\n");
            }
            else {
                bw.write(queue[front]+"\n");
            }
        }
        void back() throws IOException {
            if(isEmpty()){
                bw.write(-1+"\n");
            }
            else {
                bw.write(queue[back-1]+"\n");
            }
        }

        void print(){
            int i = front;
            System.out.print("[ ");
            while(i != back){
                System.out.print(queue[i]+ " ");
                i++;
                if(i>size){
                    i = i%size;
                }
            }
            System.out.print("]\n");
        }
    }
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] command;
        Queue q = new Queue(n);

        for(int i = 0; i < n; i++){
            command = br.readLine().split(" ");
            switch (command[0]){
                case "push" :
                    q.push(Integer.parseInt(command[1]));
                    break;
                case "pop" :
                    q.pop();
                    break;
                case "size" :
                    q.size();
                    break;
                case "empty" :
                    q.empty();
                    break;
                case "front" :
                    q.front();
                    break;
                default :
                    q.back();
                    break;
            }
//            q.print();
        }


        br.close();
        bw.flush();
        bw.close();
    }
}
