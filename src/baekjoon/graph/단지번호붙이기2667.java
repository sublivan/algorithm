package graph;

import java.io.*;
import java.util.*;

public class 단지번호붙이기2667 {

    static int[][] map;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] visited;
    static int n;
    static int count;
    static List al;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] str;
        map = new int[n+1][n+1];
        visited = new int[n+1][n+1];
        al = new ArrayList();

        for(int i=0; i < n; i++){
            str = br.readLine().split("");
            for(int j=0 ; j < n; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }


        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){
                    count=1;
                    dfs(i, j);
                    al.add(count);
                }
            }
        }
        Collections.sort(al);

        System.out.println(al.size());

        for(int i=0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

    }
    static int dfs(int x, int y){
        visited[x][y] = 1;

        for(int i=0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if( nx >= 0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && visited[nx][ny] ==0){
                    dfs(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }

}
