package homework.week12;
import java.io.*;
import java.util.*;

//1가지 경우에 대한 브루트포스 + 투포인터
public class b2798_2 {
    public static void main(String[] args) throws IOException {
        // 입력 최적화: BufferedReader + StringTokenizer
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 카드 수
        int M = Integer.parseInt(st.nextToken()); // 목표 값

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 카드 배열을 오름차순 정렬
        Arrays.sort(cards);

        int maxSum = 0;

        // 첫 번째 카드를 고정하고, 두 번째 카드와 세 번째 카드는 투 포인터 방식으로 탐색
        for (int i = 0; i < N - 2; i++) {
            int left = i + 1, right = N - 1;
            while (left < right) {
                int sum = cards[i] + cards[left] + cards[right];

                // 합이 M과 같으면 바로 출력하고 종료
                if (sum == M) {
                    System.out.println(M);
                    return;
                }

                // M보다 작은 합일 때: 왼쪽 포인터를 증가시켜 합을 키운다
                if (sum < M) {
                    left++;
                }
                // M보다 큰 합일 때: 오른쪽 포인터를 감소시켜 합을 줄인다
                else {
                    right--;
                }

                // 최대 합 갱신
                if (sum < M) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        // 최종 출력: M을 넘지 않으면서 가장 가까운 합
        System.out.println(maxSum);
    }
}
