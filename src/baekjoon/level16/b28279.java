    package baekjoon.level16;
    import java.io.*;

    public class b28279 {

        //command 패턴 적용 : 명령을 객체화
        static class DequeCommand{
            void exec() throws IOException{
                }
        }
        static class DequeCommand1 extends DequeCommand {
            void exec() throws IOException {
                deque.pushFront(readInt());
                }
        }
        static class DequeCommand2 extends DequeCommand {
            void exec() throws IOException {
                deque.pushRear(readInt());
                };
        }
        static class DequeCommand3 extends DequeCommand{
            void exec() throws IOException {
                sb.append(deque.popFront()).append("\n");
            }
        }
        static class DequeCommand4 extends DequeCommand{
            void exec() throws IOException {
                sb.append(deque.popRear()).append("\n");
            }
        }
        static class DequeCommand5 extends DequeCommand{
            void exec() throws IOException {
                sb.append(deque.count()).append("\n");
            }
        }
        static class DequeCommand6 extends DequeCommand{
            void exec() throws IOException {
                sb.append((deque.isEmpty() ? 1 : 0)).append("\n");
            }
        }
        static class DequeCommand7 extends DequeCommand{
            void exec() throws IOException {
                sb.append(deque.pickFront()).append("\n");
            }
        }
        static class DequeCommand8 extends DequeCommand{
            void exec() throws IOException {
                sb.append(deque.pickRear()).append("\n");
            }
        }


        static class Deque{
            static int[] deque;
            static int front;
            static int rear;
            static int size;
            //if rear>front, {... , front, a, b, c, d, rear, ... }
            //if front>rear, {a, b, c, rear, ... , front, x, y, z}

            Deque(int n){
                deque = new int[n+2];
                front=0;
                rear=1;
                size=n+2;
            }

            boolean isEmpty(){
                return (rear-front==1)||(front==size-1&&rear==0);
            }

            void pushFront(int x){
                deque[front] = x;
                front = (front-1+size)%size;
            }

            void pushRear(int x){
                deque[rear] = x;
                rear = (rear+1)%size;
            }

            int pickFront(){
                if(isEmpty()) return -1;
                else return deque[(front+1)%size];
            }

            int pickRear(){
                if(isEmpty()) return -1;
                else return deque[(rear-1+size)%size];
            }

            int popFront(){
                if(!isEmpty()) {
                    int temp = deque[(front + 1) % size];
                    front = (front+1)%size;
                    return temp;
                }
                else return -1;
            }

            int popRear(){
                if(!isEmpty()) {
                    int temp = deque[(rear - 1 + size) % size];
                    rear = (rear-1+size)%size;
                    return temp;
                }
                else return-1;
            }


            int count(){
                return (size-front-1+rear)%size;
            }
        }

        static class Execution {
            static DequeCommand[] dequeCommands = {
                    new DequeCommand1(),
                    new DequeCommand2(),
                    new DequeCommand3(),
                    new DequeCommand4(),
                    new DequeCommand5(),
                    new DequeCommand6(),
                    new DequeCommand7(),
                    new DequeCommand8()
            };
            public Execution(){
                dequeCommands[0] = new DequeCommand1();
                dequeCommands[1] = new DequeCommand2();
                dequeCommands[2] = new DequeCommand3();
                dequeCommands[3] = new DequeCommand4();
                dequeCommands[4] = new DequeCommand5();
                dequeCommands[5] = new DequeCommand6();
                dequeCommands[6] = new DequeCommand7();
                dequeCommands[7] = new DequeCommand8();
            }

            static void execution() throws IOException {
                for(int i = 0; i < n; i++){
                    Execution.dequeCommands[readInt()-1].exec();
                }
                System.out.println(sb);
            }
        }

        static int readInt() throws IOException{
            int input = br.read();
            int result = 0;
            while(input!=10&&input!=32){
                result *= 10;
                result += input-48;
                input = br.read();
            }
            return result;
        }

        static int n;
        static Deque deque;
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static StringBuilder sb = new StringBuilder();
        public static void main(String[] args) throws IOException {
            n = readInt();
            deque = new Deque(n);
            Execution.execution();

            br.close();
            bw.flush();
            bw.close();
        }
    }