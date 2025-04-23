package homework.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1931 {
    static class Tuple implements Comparable<Tuple> {
        int startTime;
        int endTime;
        Tuple(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }
        @Override
        public int compareTo(Tuple t) {
            if(endTime > t.endTime){
                return 1;
            }
            // 오답 원인 : 시작시간과 종료시간이 같은 경우의 Tuple은
            // 같은 종료시간을 갖고있는 다른 Tuple보다 나중에 수행되어야 최댓값을 보인다.
            // 만약 모든 회의의 시작시간과 종료시간이 다르다면 시작시간 기준 정렬은 필요 없다.
            else if(endTime == t.endTime){
                if(startTime > t.startTime){
                    return 1;
                }
                else if(startTime == t.startTime){
                    return 0;
                }
                else return -1;
            }
            else return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        PriorityQueue<Tuple> queue = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            queue.add(new Tuple(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int currentTime = 0;
        int count = 0;
        Tuple temp;
        while(!queue.isEmpty()){
            temp = queue.peek();
            if(temp.startTime<currentTime){
                queue.remove();
            }
            else{
                count++;
                currentTime = temp.endTime;
                queue.remove();
            }
        }

        System.out.println(count);
    }
}
