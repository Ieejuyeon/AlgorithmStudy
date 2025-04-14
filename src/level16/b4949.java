package level16;

import java.io.*;
public class b4949 {
    static class Stack{
        char[] stack = new char[100];
        int top = 0;

        void put(char c){
            stack[top++] = c;
        }

        boolean pop(char c) {
            if (top != 0) {
                if((stack[top-1]=='['&&c==']')||(stack[top-1]=='('&&c==')')){
                    top--;
                    return true;
                 }
            }
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp = br.readLine();
        Stack stack = new Stack();
        char c;
        boolean isVPS;
        while(!temp.equals(".")){
            isVPS = true;
            for(int i =0; i < temp.length(); i++){
                c = temp.charAt(i);
                if(c=='('||c=='['){
                    stack.put(c);
                }
                else if(c==')'||c==']'){
                    if(!stack.pop(c)){
                        isVPS = false;
                        break;
                    }
                }
            }
            if(isVPS&&stack.top==0){
                bw.write("yes"+"\n");
            }
            else bw.write("no"+"\n");

            temp = br.readLine();
            stack = new Stack();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
