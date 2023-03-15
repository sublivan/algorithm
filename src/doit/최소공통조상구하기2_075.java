package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * [최소공통조상]
 * boj 11438
 *
 * N개의 노드로 이뤄진 트리가 있다.
 * 트리의 각 노드는 1번 부터 N번가지 번호가 있고, 루트는 1번이다.
 * 두 노드의 쌍 M개가 주어졌을 때 두 노드의 가장 가까운 공통 조상이 몇번인지 출력하라
 *
 * 조건
 * - 2 <= N <= 100,000
 * - 1 <= M <= 100,000
 *
 * 입력
 * - 노드의 개수 N
 * - (N-1개줄) 연결된 두 노드
 * - 쌍의 개수 M
 * - (M개의 줄) LCA를 구할 두 노드
 */
public class 최소공통조상구하기2_075 {

    static int[] depth; // 깊이 정보
    static List<Integer>[] tree; // 노드 트리
    static int[][] parent; // 부모노드 정보
    static int kmax; // 최대 부모노드 점프수, 2^k <= N
    static boolean[] visited; // 노드 방문여부

    static int N, M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < N -1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            tree[u].add(v);
            tree[v].add(u);
        }

        int temp = 1;
        kmax = 0;
        while (temp <= N) { // 2^k <= N
            temp <<= 1;
            kmax++;
        }
        // System.out.println("kmax = " + kmax);

        depth = new int[N + 1];
        parent = new int[kmax + 1][N + 1];

        visited = new boolean[N + 1];
        dfs(1, 1);

        // System.out.println("depth[] = " + Arrays.toString(depth));

        setParent(); // 부모 노드 저장배열 만들기
//        for (int k = 0; k <= kmax; k++) {
//            for (int n = 1; n <= N; n++) {
//                System.out.print(parent[k][n] + " ");
//            }
//            System.out.println();
//        }

        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            int LCA = lca(u, v);
            System.out.println(LCA);
        }
    }

    /**
     * 2^k까지의 부모 노드 정보 저장하기
     * 빠르게 구하기이므로 2^k씩 단위가 올라간다.
     */
    private static void setParent() {
        for (int k = 1; k <= kmax; k++) { // 2^1, 2^2... 2^K
            for (int n = 1; n <= N; n++) {
                parent[k][n] = parent[k-1][parent[k-1][n]]; // 부모 노드 배열 점화식
            }
        }
    }

    /**
     * 두 노드의 최소 공통 조상 구하기
     * @param a
     * @param b
     * @return 최소공통조상
     */
    private static int lca(int a, int b) {
        if (depth[a] > depth[b]) { // 더 깊은 depth가 b가 되도록 설정
            int temp = a;
            a = b;
            b = temp;
        }

        // 먼저 깊이가 동일하도록 계산
        for (int k = kmax; k >= 0; k--) {
            if (Math.pow(2, k) <= depth[b] - depth[a]) {
                b = parent[k][b];
            }
        }

        if (a == b) // 부모가 같다면
            return a;
        for (int k = kmax; k >= 0; k--) { // 조상 빠르게 찾기
            if (parent[k][a] != parent[k][b]) {
                a = parent[k][a];
                b = parent[k][b];
            }
        }
        return parent[0][a];
    }

    /**
     * 각 노드의 깊이 및 부모 노드 정보 초기화
     * @param node
     * @param dep
     */
    private static void dfs(int node, int dep) {
        visited[node] = true;
        for (int next : tree[node]) {
            if (!visited[next]) {
                visited[next] = true;
                depth[next] = dep;
                parent[0][next] = node; // 현재 값은 다음 값의 부모
                dfs(next, dep + 1);
            }
        }
    }
}
