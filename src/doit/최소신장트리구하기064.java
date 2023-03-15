package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [최소신장트리]
 * boj 1197
 *
 * 그래프가 주어졌을 때 그 그래프의 최소 신장 트리를 구하라
 *
 * 입력
 * - 노드의 개수 V, 엣지의 개수 E
 * - 엣지의 관련 정보 노드 A, 노드 B, 가중치 C
 *
 * 조건
 * - C는 음수 가능, 절대값이 1,000,000을 넘지 않는다.
 *
 * 출력
 * - 최소 신장 트리의 가중치를 출력
 */
public class 최소신장트리구하기064 {

    static int[] parent;
    static Queue<Edge> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        parent = new int[V + 1];
        graph = new PriorityQueue<>();

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            graph.offer(new Edge(start, end, value));
        }

        for (int i = 1; i <= V; i++) {
            parent[i] = i;
        }

        int result = 0;
        for (int i = 0; i < V; i++) {
            Edge edge = graph.poll();
            if (find(edge.start) != find(edge.end)) {
                union(edge.start, edge.end);
                result += edge.value;
            }
        }

        System.out.println(Arrays.toString(parent));
        System.out.println("result = " + result);
    }
    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            parent[b] = a;
        }
    }

    public static int find(int k) {
        if (k == parent[k])
            return k;
        return parent[k] = find(parent[k]);
    }

    static class Edge implements Comparable<Edge> {
        int start;
        int end;
        int value;

        public Edge(int start, int end, int value) {
            this.start = start;
            this.end = end;
            this.value = value;
        }

        @Override
        public int compareTo(Edge e) {
            return this.value - e.value;
        }
    }
}
