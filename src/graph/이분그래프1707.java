package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 이분그래프1707 {

    static int K, V, E;
    static ArrayList<Integer>[] graph;
    static int[] visitCheck;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        K = Integer.parseInt(br.readLine());

        while( K-- > 0){
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            graph = new ArrayList[V+1];
            // 정점의 방문여부
            // 0 : 방문 X, 1 : n1 소속 방문O , 2: n2 소속 방문O
            visitCheck = new int[V + 1];

            for(int i=0; i < V+1; i++){
                graph[i] = new ArrayList<>();
            }

            for(int i = 0; i < E; i++){
                st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());

                graph[n1].add(n2);
                graph[n2].add(n1);
            }

            boolean flag = true;

            for(int i=1; i<=V; i++){
                /// 정점 i 방문 X인 상태라면,
                if( visitCheck[i] == 0 ) {
                    dfs(i, 1);
                }
            }
            for(int i =1; i <= V; i++){
                for(int j : graph[i]){
                    if( visitCheck[i] == visitCheck[j]){
                        flag = false;
                    }
                }
            }
            System.out.println(flag?"YES":"NO");

        }
    }

    static void dfs(int x, int check) {
        visitCheck[x] = check;
        for (int i : graph[x]) {
            if (visitCheck[i] == 0) {
                dfs(i, 3 - check);
            }
        }
    }
}
