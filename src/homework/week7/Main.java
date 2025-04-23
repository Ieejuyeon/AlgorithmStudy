package homework.week7;

import java.io.*;
import java.util.StringTokenizer;

// n번째 사람이 인출하는데 걸리는 시간은 Pn,
// 각 사람이 돈을 인출하는데 필요한 시간은 Qn이라고 했을 때 Qn = Q(n-1) + Pn 이다. (Q0 = 0)
// Q1 = P1
// Q2 = P1 + P2
// Q3 = P1 + P2 + P3
// ...
// Q(n-2) = P1 + P2 + ... + P(n-2)
// Q(n-1) = P1 + P2 + ... + P(n-2) + P(n-1)
//     Qn = P1 + P2 + ... + P(n-2) + P(n-1) + Pn
// 이므로, Q1부터 Qn까지의 합은 ∑(i=1 to n) Pi*(n-i+1) 이다.
// 위 식은 i가 클수록 (n-i+1)이 작아지므로, 모든 i에 대해 Pi >= P(i-1)이어야 식이 최솟값이 된다.
// 즉, 오름차순으로 정렬되어야 각 사람이 돈을 인출하는데 필요한 시간의 합이 최솟값이 된다.

public class Main {
    // 기수정렬을 위한 간단한 큐 구현
    static class Queue {
        int queue[];
        int front = 0;
        int rear = 0;

        private Queue(int n) {
            queue = new int[n];
        }
        private void init(){front=0; rear=0;}
        private void push(int x) {
            queue[rear] = x;
            rear++;
        }

        private int pop() {
            int temp = queue[front];
            front++;
            return temp;
        }

        private boolean isEmpty() {
            return front - rear == 0;
        }
    }

    public static void main(String[] args) throws IOException {

        // 입력을 받기 위한 인스턴스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        // Pn 배열
        int[] array = new int[n];
        // 기수 정렬을 위한 큐
        Queue[] queue = new Queue[10];
        // Pn 입력받기
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        //int q[1000] 을 가지는 Queue 객체 할당
        for (int i = 0; i < 10; i++) {
            queue[i] = new Queue(1000);
        }

        // 기수정렬 알고리즘 (Collections.sort(ArrayList<>) 대비 메모리 70%, 실행시간 50%)
        // Pn 배열 array를 정리하는 과정

        // digit : 정렬의 기준이 될 자리수
        int digit = 1;
        // 최대값이 1000이므로 네자리까지 정렬해야해서 j<4로 제한, 최댓값 9999까지 정렬가능
        for (int j = 0; j < 4; j++) {
            // temp : 정렬해야하는 수
            // index : temp의 digit의 자리에 위치해있는 수, Queue[index]에 temp를 삽입
            int temp, index;
            for (int i = 0; i < n; i++) {
                temp = array[i];
                index = (temp / digit) % 10;
                queue[index].push(temp);
            }

            // index(초기화하여 재사용) : queue에있는 Queue객체 10개를 0~9 인덱스 순으로 꺼내어 array에 재삽입
            // 해당 자리수 순으로 정렬, 큐를 사용하였으므로 x자리수를 정렬한 결과가 10x자리수 정렬에서도 자연스럽게 반영됨
            index = 0;
            for (int i = 0; i < 10; i++) {
                while (!queue[i].isEmpty()) {
                    array[index] = queue[i].pop();
                    index++;
                }
                queue[i].init();
            }

            //자리수 증가
            digit *= 10;
        }

        // Q1부터 Qn까지의 합 = ∑(i=1 to n) Pi*(n-i+1)

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += array[i] * (n - i);
        }
        System.out.print(result);
    }
}