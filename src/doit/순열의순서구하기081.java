package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [순열과조합]
 * boj 1722
 *
 * 임의의 순열은 영문 사전의 정렬 방식과 비슷하게 정렬된다고 하자
 * - N = 3이면 {1, 2, 3} {1, 3, 2} {2, 1, 3} {2, 3, 1} {3, 1, 2} {3, 2, 1}
 * N이 주어지면 다음 두 소문제 중 1개를 푸는 프로그램 작성하라
 * - 소문제 1 : K가 주어지면 K번째 순열을 구한다
 * - 소문제 2 : 임의의 순열이 주어지면 이 순열이 몇 번째 순열인지 구한다.
 *
 * 입력
 * - 순열의 개수 N
 * - 소문제번호(1 or 2), K or 순열을 나타내는 N개의 수
 *
 * 출력
 * - 소문제와 관련된 정답 출력
 */
public class 순열의순서구하기081 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Q = Integer.parseInt(st.nextToken());

        long[] F = new long[N + 1]; // 순열의 경우의 수
        int[] S = new int[N + 1]; // 정답 순열
        boolean[] visited = new boolean[N + 1]; // 숫자 중복 체크

        F[0] = 1;
        for (int i  = 1; i <= N; i++) {
            F[i] = F[i-1] * i;
        }

        if (Q == 1) { // K번째 순열 출력하기
            long k = Long.parseLong(st.nextToken()); // 주어진 값
            for (int i = 1; i <= N; i++) { // 정답 순열이 완성될때까지 반복
                for (int j = 1, cnt = 1; j <= N; j++) { // cnt: 순열의 순서
                    if(visited[j]) // 이미 사용한 숫자는 사용할 수 없음
                        continue;
                    if (k <= cnt * F[N - i]) { // 주어진 K에 따라 각 자리에 돌어갈 수 있는 수 찾기
                                               // N 자리의 순열을 정할 때는 N-1번째 순열의 경우의 수를 이용
                        k -= ((cnt - 1)) * F[N - i]; // F[N-1] : 경우의 수
                        S[i] = j;
                        visited[j] = true;
                        break;
                    }
                    cnt++;
                }
            }
            for (int i = 1; i <= N; i++) {
                System.out.print(S[i] + " ");
            }
        } else { // 입력된 순열의 순서 구하기
            // 1. N자리의 순열의 숫자를 받아 몇 번째 순서의 숫자인지 확인(현재 숫자-자기보다 앞 숫자 중 이미 사용한 숫자)
            // 2. 해당 순서 * (현재 자리 - 1에서 만들 수 있는 순열의 개수)를 K에 더한다.
            // 3. 모든 자릿수에 관해 1 ~ 3을 반복한 후 K값 출력
            long K = 1; // K의 최솟값

            for (int i = 1; i <= N; i++) {
                S[i] = Integer.parseInt(st.nextToken());
                long cnt = 0;
                for (int j = 1; j < S[i]; j++) {
                    if (!visited[j]) {
                        cnt++; // 미사용 숫자 개수만큼 카운트
                    }
                }
                K += cnt * F[N - i]; // 자릿수에 따라 순서 더하기
                visited[S[i]] = true;
            }
            System.out.println(K);
        }
    }
}
