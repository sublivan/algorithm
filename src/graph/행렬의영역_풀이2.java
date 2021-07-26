package graph;

import java.util.*;
//2020하반기 nhn pre-test 1차 모의시험
public class 행렬의영역_풀이2 {


    private static int[][] visited;
    private static int cnt;
    private static int[] X = {-1, 0, 1, 0}; // 좌 상 우 하
    private static int[] Y = {0, 1, 0, -1}; // 좌 상 우 하

    public static void main(String[] args) {
        int[][] map = {{1,1,1,0,1},
                {1,1,0,0,1},
                {1,0,1,1,0},
                {0,0,1,1,1},
                {0,0,1,1,1}};
        solution(5,map);
    }
    private static void solution(int sizeOfMatrix, int[][] matrix) {
        visited = new int[sizeOfMatrix][sizeOfMatrix];
        List<Integer> matrix_list = new ArrayList<>();

        for (int i = 0; i < sizeOfMatrix; i++)
        {
            for (int j = 0; j < sizeOfMatrix; j++)
            {
                if (matrix[i][j] == 1 && visited[i][j] == 0)
                {
                    dfs(i, j, matrix);
                    matrix_list.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(matrix_list);
        System.out.println(matrix_list.size());
        for(int i : matrix_list)
        {
            System.out.print(i + " ");
        }

    }

    private static void dfs(int x, int y, int[][] matrix)
    {
        visited[x][y] = 1;
        matrix[x][y] = 0;
        int nx;
        int ny;

        for (int i = 0; i < 4; i++)
        {
            nx = x + X[i];
            ny = y + Y[i];

            //이동할 수 있는 최대 최소 위치안에 있어야된다.
            if (nx >= 0 && ny >= 0 && nx < visited.length && ny < visited.length)
            {
                if (matrix[nx][ny] == 1 && visited[nx][ny] == 0)
                {
                    dfs(nx, ny, matrix);
                }
            }
        }
        cnt++;
    }


}
