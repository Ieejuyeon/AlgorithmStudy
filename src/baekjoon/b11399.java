package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class b11399 {

    static class Queue {
        int q[] = new int[1000];
        int top = 0;

        void push(int n){
            q[top] = n;
            top++;
        }
        int pop(){
            int tmp = q[0];
            for(int i = 0; i < top-1; i++){
                q[i]=q[i+1];
            }
            top--;
            return tmp;
        }
        boolean empty(){
            return (top==0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p;
        Queue[] queue = new Queue[10];
        p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }
        Queue[] q = new Queue[10];
        for(int i = 0; i < 10; i++){
            q[i] = new Queue();
        }
        int sum = 0;
        int digit = 1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < n; j++){
                q[(p[j]/digit)%10].push(p[j]);
            }
            int m = 0;
            for(int j = 0; j < 10; j++){
                while(!q[j].empty()){
                    p[m] = q[j].pop();
                    m++;
                }
            }
            digit = digit*10;
        }

        for(int i = 0; i < n; i++){
            sum += p[i]*(n-i);
        }

        System.out.println(sum);

    }

    }
