package baekjoon.level16;

import java.io.*;
import java.util.StringTokenizer;

public class b2346 {
    static class Balloon {
        int loc;
        int val;
        Balloon(int loc, int val){
            this.loc = loc;
            this.val = val;
        }
    }
    static class Balloons {
        Balloon[] balloon;
        int front;
        int rear;
        int size;

        Balloons() throws IOException {
            size = Integer.parseInt(br.readLine())+2;
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            balloon = new Balloon[size];
            for(int i = 1; i < size-1; i++){
                balloon[i] = new Balloon(i,Integer.parseInt(stringTokenizer.nextToken()));
            }
            front = 0;
            rear = size-1;
        }
        // { ... , front, 1, 2, 3, rear, ...}
        // { 1, 2 , rear, ... , front, 3, 4 }

        // { ... , 0(front), 1, 2, 3, 4(last), ...} +2 이동
        // { ... , 0, 1, 2(front), 3, 4(last), ...}
        // { 1(last), ... , 2(front), 3, 4, 0}  -2 이동
        // { 1(front), 2, 3, 4, 0(last), ... }
        // { 1(front), 2, 3, 4, 0(last), ... }
        Balloon popFront(){
            front = (front + 1)%size;
            return balloon[front];
        }
        Balloon popRear(){
            rear = (rear - 1 + size)%size;
            return balloon[rear];
        }
        int pickFront(){
            return balloon[(front+1)%size].val;
        }
        int pickRear(){
            return balloon[(rear-1+size)%size].val;
        }

        void pushRear(Balloon x){
            balloon[rear] = x;
            rear = (rear+1)%size;
        }
        void pushFront(Balloon x){
            balloon[front] = x;
            front = (front-1+size)%size;
        }

        void moveForward(int n){
            for(int i = 0; i < n-1; i++){
                pushRear(popFront());
            }
        }
        void moveBackward(int n){
            for(int i = 0; i < n; i++){
                pushFront(popRear());
            }
        }
        boolean isEmpty(){
            return (rear-1+size)%size == front;
        }
        void print() throws IOException {
            while(!isEmpty()){
                Balloon temp = popFront();
                if(temp.val > 0){
                    moveForward(temp.val);
                }
                else {
                    moveBackward((temp.val*-1));
                }
                bw.write(temp.loc+" ");
            }
        }
        public String toString(){
            int count = (rear-front-1+size)%size;
            int st = (front+1)%size;
            StringBuilder s= new StringBuilder("[");
            for(int i = 0; i<count; i++){
                s.append(balloon[st].val).append(",");
                st = (st+1)%size;
            }
            s.append("]\n");
            return s.toString();
        }
    }


    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Balloons b = new Balloons();
        b.print();

        bw.flush();
        bw.close();
        br.close();
    }
}
