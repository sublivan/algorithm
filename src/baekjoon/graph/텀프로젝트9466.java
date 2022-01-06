package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 텀프로젝트9466 {
    static int t,n;
    static int[] graph;
    static int[] visited;
    static int[] finished;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            n = Integer.parseInt(br.readLine());

            graph = new int[n+1];
            //1)
            visited = new int[n+1];
            finished = new int[n+1];
            cnt =0;

            st = new StringTokenizer(br.readLine());

            for(int i=1; i <= n; i++){
                graph[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=1; i <= n; i++){
                dfs(i);
            }

            System.out.println(n-cnt);

        }
    }
    static void dfs(int now){
        //탐색했으면 1 안했으면 0
        if(visited[now] == 1){
            return;
        }

        visited[now] =1;
        int next = graph[now];

        if(visited[next] == 0){
            dfs(next);
        }
        else{
            if(finished[next] == 0){
                // 노드가 끝나려면 싸이클을 무조건 거쳐야한다.
                // 따라서 현재 노드가 아닌 다음 노드 기준으로 하면 싸이클이 무조건 존재
                cnt++;
                for(int i= next; i != now; i = graph[i]){
                    cnt++;
                }
            }
        }
        finished[now] =1;

    }

}
/*
visited 배열은 단순히 방문 여부를 체크하는 것이고,
finished 배열은 방문한 노드에서 싸이클을 이미 뽑아냈었는가를 확인합니다.

 */