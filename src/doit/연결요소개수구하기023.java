package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * [깊이우선탐색]
 * boj 11724
 *
 * 방향 없는 그래프가 주어졌을때 연결 요소의 개수를 구하라
 *
 * 입력
 * - 노드의 개수 N,에지의 개수 M
 * - M개의 에지의 끝점 u, v
 * 출력
 * - 연결 요소의 개수
 */
public class 연결요소개수구하기023 {
    private static boolean[] visited;
    private static List<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        visited = new boolean[N + 1]; // 방문한 노드 체크

        for (int i = 1; i < N + 1; i++) {
            A[i] = new ArrayList<>(); // 인접리스트 초기화
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            A[x].add(y); // 양방향
            A[y].add(x); // 양방향
        }

        int count = 0;
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    private static void dfs(int now) {
        if (visited[now]) {
            return;
        }
        visited[now] = true;
        for (int next : A[now]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
