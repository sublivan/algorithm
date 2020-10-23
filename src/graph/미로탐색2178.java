package graph;

import java.util.*;

public class 미로탐색2178 {

    static int n, m;
    static int[][] map;
    static int[][] visit;
    //위아래좌우 4방향
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        visit = new int[n][m];

        for(int i=0; i<n; i++){
            String[] str = sc.next().split("");
            for(int j=0; j<m ; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        bfs(0, 0);
        System.out.println(map[n-1][m-1]);


    }
    static void bfs(int x, int y) {

        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();

        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty() && !qy.isEmpty()) {
            x = qx.poll();
            y = qy.poll();

            visit[x][y] = 1;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {

                    if (map[nx][ny] == 1 && visit[nx][ny] == 0) {
                        qx.add(nx);
                        qy.add(ny);
                        visit[nx][ny] = 1;
                        //방문한 좌표는 이동횟수로 변경
                        map[nx][ny] = map[x][y] + 1;
                    }
                }
            }
        }
    }
}

/*
참고
https://ggmouse.tistory.com/315
 */