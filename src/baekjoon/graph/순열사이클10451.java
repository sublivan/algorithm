package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 순열사이클10451 {
    static List<Integer>[] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());


        while(t-- > 0){
            int n =Integer.parseInt(br.readLine());
            visited = new int[n+1];
            graph = new ArrayList[n+1];

            for(int i=0; i <= n; i++){
                graph[i] = new ArrayList<>();
            }
            st = new StringTokenizer(br.readLine());
            for(int i=1; i <= n; i++){
                int input = Integer.parseInt(st.nextToken());
                graph[i].add(input);
            }

            int cnt =0 ;
            for(int i=1; i <= n; i++){
                if(visited[i] == 0){
                    dfs(i);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    static void dfs(int node){
        visited[node] =1;
        for(int i : graph[node]){
            if(visited[i] ==0)
                dfs(i);
        }
    }

}
