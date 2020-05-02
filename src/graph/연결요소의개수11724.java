package graph;

import java.io.*;
import java.util.*;

public class 연결요소의개수11724 {
    static int N,M;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

         graph = new ArrayList[N+1];
         visited =new boolean[N+1];

         //중요! 1)
         for(int i=1; i < N + 1; i++){
             graph[i] = new ArrayList<Integer>();
         }

        for(int i=0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        //2)
        int cnt = 0;

        for(int i=1; i < N + 1; i++){
            if( !visited[i] ){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int node){
        if( visited[node] ){
            return;
        }
        visited[node] = true;
        for( int i : graph[node] ){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
/*
1)초기화 안해주면 NullPointerException 뜸

2)연결요소의 갯수를 알게 해주는 변수
dfs 가 끝나고 나오면 한개씩 상승
 */