package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [다익스트라]
 * boj 1753
 *
 * 에지의 가중치가 10 이하의 자연수인 방향 그래프가 있다.
 * 이 그래프의 시작점에서 다른 모든 노드로의 최단경로를 구하라
 *
 * 입력
 * - 노드의 개수 V, 에제이 개수 E
 * - 출발 노드번호 K
 * - 에지의 정보 (u, v, w)
 *      - w : u에서 v로 가는 가중치
 * 출력
 * - 최단 경로 값
 * 조건
 * - 시작점은 0, 경로가 없으면 INF
 * - 두 노드 사이에 에지가 2개 이상 존재 가능
 * - 1 <= V <= 20,000, 1 <= E <= 300,000
 *
 */
public class 최단경로구하기056 {
    public static boolean[] visited;
    public static int[] distance;
    public static List<Edge> graph[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        visited = new boolean[V + 1]; // 방문한 노드 기록
        distance = new int[V + 1]; // 최단 거리 배열
        for (int i = 0; i <= V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            graph[u].add(new Edge(v, w));
        }

        // 다익스트라
        dijkstra(K);

        for (int i = 1; i <= V; i++) {
            if (visited[i]) {
                System.out.println(distance[i]);
            } else {
                System.out.println("INF");
            }
        }
    }

    private static void dijkstra(int K) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();

        // 값이 가장 작은 노드 고르기
        queue.add(new Edge(K, 0));
        distance[K] = 0;
        while (!queue.isEmpty()) {
            Edge now = queue.poll();
            int now_vertex = now.vertex;
            visited[now_vertex] = true;

            // 선택 노드에 연결된 노드를 순회
            for (Edge next : graph[now_vertex]) {
                int vertex = next.vertex;
                int nextDistance = next.value + distance[now_vertex];

                // 최단거리 배열 업데이트 (Min(선택 노드의 최단 거리 배열의 값 + 에지 가중치, 연결 노드의 최단 거리배열의 값)
                if (distance[vertex] > nextDistance) {
                    distance[vertex] = nextDistance;
                    queue.add(new Edge(vertex, distance[vertex]));
                }
            }
        }
    }

    static class Edge implements Comparable<Edge> {
        int vertex, value;

        public Edge(int vertex, int value) {
            this.vertex = vertex;
            this.value = value;
        }

        @Override
        public int compareTo(Edge e) {
            return this.value - e.value; // 가중치가 작은 것이 우선
        }
    }
}
