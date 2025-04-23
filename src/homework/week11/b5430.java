package homework.week11;

import java.io.*;
import java.util.StringTokenizer;

public class b5430 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static class Queue{
        int[] arr;
        int front, rear;
        // 뒤집힘 여부, 뒤집혔으면 -1 아니면 1
        int sequence;

        Queue(int n, String s){
            arr = new int[n];
            StringTokenizer st = new StringTokenizer(s.substring(1, s.length()-1), ",");
            front = 0;
            rear = n;
            sequence = 1;
            for(int i = 0;  i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
        }

        private boolean isEmpty(){
            return front==rear;
        }

        private int size(){
            return (rear-front)*sequence;
        }

        private int pop() {
            int temp = arr[front];
            front += sequence;
            return temp;
        }

        boolean D(){
            if(isEmpty()) return false;
            else{
                pop(); return true;
            }
        }

        void R(){
            sequence *= -1;
            int temp = front;
            front = rear + sequence;
            rear = temp + sequence;
        }

        public String toString(){
            if(isEmpty()) return "[]";
            else{
                int n = size();
                StringBuilder sb = new StringBuilder();
                sb.append("[").append(pop());
                for(int i = 1; i < n; i++) {
                    sb.append(",");
                    sb.append(pop());
                }
                sb.append("]");
                return sb.toString();
            }
        }
    }

    // Queue 클래스를 이용하여 명령어와 배열을 입력받고 실행 결과를 출력하는 메소드
    static void AC() throws IOException {
        // 명령어와 배열
        String command, arr;
        // 입력받기 및 초기화
        command = br.readLine();
        int n = Integer.parseInt(br.readLine());
        arr = br.readLine();
        Queue q = new Queue(n, arr);
        boolean error = false;

        // 명령어에 따른 메소드 호출
        int cl = command.length();
        for(int i = 0; i < cl; i++){
            if(command.charAt(i)=='R'){
                q.R();
            }
            else if(!q.D()){
                bw.write("error\n");
                error = true;
                break;
            }
        }
        // 에러가 발생하지 않았으면 프린트 (toString 호출)
        if(!error){
            bw.write(q +"\n");
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            AC();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
