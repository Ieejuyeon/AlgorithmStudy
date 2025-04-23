package homework.week12;
import java.io.*;
import java.util.*;
// 2가지 경우에 대한 브루트포스 + 이진탐색
public class b2798 {
    public static void main(String[] args) throws IOException {
        // 입력 최적화: Scanner 대신 BufferedReader + StringTokenizer 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 카드 수
        int M = Integer.parseInt(st.nextToken()); // 목표 수치

        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬: 이진 탐색 및 가지치기를 위해 정렬 수행
        Arrays.sort(cards);

        int maxSum = 0;

        // 두 장의 카드를 선택
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                int sumTwo = cards[i] + cards[j];

                // 가지치기 : 두 장만으로도 M 이상이면 이후는 더 클 테니 생략
                if (sumTwo >= M) break;

                // 이진 탐색 대상 값: M에서 두 장의 합을 뺀 값
                int target = M - sumTwo;

                // 이진 탐색: 세 번째 카드는 j 이후에서만 찾는다
                int idx = upperBound(cards, j + 1, N, target) - 1;

                // 유효하지 않은 세 번째 카드 (중복 인덱스) 제거
                if (idx <= j) continue;

                int total = sumTwo + cards[idx];

                // 조기 종료: 정확히 M이면 바로 출력 후 종료
                if (total == M) {
                    System.out.println(M);
                    return;
                }

                // 현재까지의 최대값 갱신
                if (total < M) {
                    maxSum = Math.max(maxSum, total);
                }
            }
        }

        // 최종 출력: M을 넘지 않으면서 가장 가까운 합
        System.out.println(maxSum);
    }

    // upperBound 구현: target 초과하는 첫 인덱스를 반환
    private static int upperBound(int[] arr, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}
