package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [위상 정렬]
 *
 * N개의 건물을 지을 때 각 건물을 짓기 위해 필요한 최소 시간을 출력
 *
 * 입력
 * - 건물의 종류 수 N
 * - N개의 줄 : 건물을 짓는데 걸리는시간, 건물을 짓기 위해 먼저 지어야 하는 건물 번호
 * 조건
 * - 각 줄은 -1로 끝난다.
 * - 각 건물을 짓는데 걸리는 시간은 100,000작거나 같은 자연수다.
 *
 * 출력
 * - N개의 각 건물이 완성되기까지 걸리는 최소 시간 출력
 */
public class 게임개발하기054 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        List<ArrayList<Integer>> list = new ArrayList<>(); // 인접리스트
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[N + 1]; // 진입 차수
        int[] selfBuild = new int[N + 1]; // 자기 자시을 짓는데 걸리는 시간
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            selfBuild[i] = Integer.parseInt(st.nextToken());

            while(true) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == -1) {
                   break;
                }
                list.get(temp).add(i);
                indegree[i]++;
            }
        }

        // 위상정렬
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int[] result = new int[N + 1]; // 정답배열
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : list.get(now)) {
                indegree[next]--;

                result[next] = Math.max(result[next], result[now] + selfBuild[now]);
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(result[i] + selfBuild[i]);
        }
    }
}
