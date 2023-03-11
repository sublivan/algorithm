package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [벨만-포드]
 * boj 11657
 *
 * N개의 도시와 한 도시에서 출발해 다른 도시에 도착하는 버스가 M개 있다.
 * A는 시작 도시, B는 도착 도시, C는 버스를 타고 이동하는데 걸리는 시간
 * 1번 도시에서 출발해 나머지 도시로 가능 가장 빠른 시간을 구하라.
 *
 * 조건
 * - C = 0 일 경우 순간 이동을 할때, C < 0일 경우 타임머신으로 시간을 되돌아 갈 때다.
 * - 1 <= A, B <= N, -10,000 <= C <- 10,000
 *
 * 입력
 * - 도시의 개수 N, 버스 노선의 개수 M
 * - 버스 노선의 정보 (A, B, C)
 *
 * 출력
 * - 1번 도시에서 출발해 어떤 도시로 가는 과정에서 시간을 무한히 오래 전으로 되도릴수 있다면(음수 사이클) -1 출력
 * - 그렇지 않다면 N-1개 줄에 걸쳐 각 줄에 1번 도시에서 출발해 2번 도시 ... N번 도시로 가는 가장 빠른 시간을 순서대로 출력
 * - 만약 이 도시로 가는 경로가 없다면 -1 출력
 *
 */
public class 타임머신으로빨리가기059 {

    static Edge[] graph;
    static long[] distance;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        distance = new long[N + 1];
        graph = new Edge[M + 1];

        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            graph[i] = new Edge(start, end, time);
        }

        distance[1] = 0;
        for (int i = 1; i < N; i++) { // N-1 만큼 반복
            for (int j = 0; j < M; j++) {
                Edge edge = graph[j];

                if (distance[edge.start] != Integer.MAX_VALUE &&
                    distance[edge.end] > distance[edge.start] + edge.time) {
                    distance[edge.end] = distance[edge.start] + edge.time;
                }
            }
        }

        boolean isCycle = false;
        for (int j = 0; j < M; j++) {
            Edge edge = graph[j];
            if (distance[edge.start] != Integer.MAX_VALUE &&
                    distance[edge.end] > distance[edge.start] + edge.time) {
                isCycle = true;
            }
        }

        if (!isCycle) {
            for (int i = 2; i <= N; i++) {
                if (distance[i] == Integer.MAX_VALUE)
                    System.out.println(-1);
                else
                    System.out.println(distance[i]);
            }
        } else {
            System.out.println(-1);
        }




    }

    static class Edge {
        int start;
        int end;
        int time;

        public Edge(int start, int end, int time) {
            this.start = start;
            this.end = end;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "start=" + start +
                    ", end=" + end +
                    ", time=" + time +
                    '}';
        }
    }
}
