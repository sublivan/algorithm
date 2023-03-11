package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [플로이드-워셜]
 * boj 11404
 *
 * n개의 도시가 있다. 한 도시에서 출발해 다른 도시에 도착하는 m개의 버스가 있다.
 * 각 버스는 한 번 사용할 때 필요한 비용이 있다.
 * 모든 도시의 쌍 (A, B)에 관해 A에서 B로 가는 데 필요한 비용의 최솟값을 구하라
 *
 * 입력
 * - 도시의 개수 n, 버스의 개수 m
 * - 버스의 정보 (출발 도시 a, 도착 도시 b, 한 번 타는데 필요한 비용 c)
 *
 * 출력
 * - n개의 줄 출력
 * - i번째 줄은 i 에서 j로 가는데 필요한 최소 비용 출력
 * - i에서 j로 갈 수 없을 때는 0 출력
 *
 * 조건
 * - 2 <= n <= 100
 * - 1 <= m <= 100,000
 * - 시작 도시와 도착 도시가 같은 경우는 없다.
 * - 비용은 100,000 보다 작거나 같다.
 * - 시작 도시와 도착 도시를 연결하는 노선은 1개가 아닐 수 있다.
 *
 */
public class 가장빠른버스노선구하기061 {

    static int[][] distance; // 인접행렬 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        distance = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    distance[i][j] = 10000001;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            if (distance[start][end] > cost) distance[start][end] = cost;
        }

        // 플로이드-워셜
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (distance[i][j] == 10000001) {
                    System.out.print(0);
                } else {
                    System.out.print(distance[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
