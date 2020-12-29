package programmers.DFS_BFS;

// programmers level3
// 깊이/너비우선 탐색 : DFS
public class 네트워크 {
    public static int[] visited;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new int[n];

        for (int i = 0; i < computers.length; i++) {
            if (visited[i] == 0) {
                answer += dfs(i, computers);
            }
        }
        return answer;
    }

    public int dfs(int now, int[][] computers) {
        if (visited[now] == 1) {
            return 0;
        }
        visited[now] = 1;

        for (int next = 0; next < computers.length; next++) {
            if (computers[now][next] == 1) {
                dfs(next, computers);
            }
        }
        return 1;
    }
}
