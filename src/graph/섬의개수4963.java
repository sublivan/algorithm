package graph;

import java.util.*;
import java.io.*;

public class 섬의개수4963 {

    static int h,w;
    static int[][] map;
    //상 하 좌 우 대각선 4방향, 이동해야할 방향은 총 8방향
    // {0 1} {1 1} {1 0} {1, -1} {0 -1} {-1 -1} {-1, 0} {-1 1}
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[][] visited;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



       while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           h = Integer.parseInt(st.nextToken());
           w = Integer.parseInt(st.nextToken());
           count =0;

           if(w ==0 && h ==0){
               break;
           }

           map = new int[w+1][h+1];
           visited = new int[w+1][h+1];

           for(int i = 0; i < w; i++){
               st = new StringTokenizer(br.readLine());
               for(int j=0; j < h; j++){
                   map[i][j] = Integer.parseInt(st.nextToken());
               }
           }

           for(int i = 0; i < w; i++){
               for(int j=0; j < h; j++){
                   if(map[i][j] == 1 && visited[i][j] == 0){
                       dfs(i,j);
                       count++;
                   }
               }
           }
           System.out.println(count);
       }
    }
    static void dfs(int x, int y){
        visited[x][y] = 1;


        for(int i=0; i < 8; i++){

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx < w && ny >=0 && ny < h){
                if(map[nx][ny] ==1 && visited[nx][ny] ==0){
                    dfs(nx, ny);
                }
            }
        }

    }



}
