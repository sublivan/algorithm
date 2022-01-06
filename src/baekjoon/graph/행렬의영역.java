package graph;

import java.util.*;

//2020하반기 nhn pre-test 1차 모의시험
public class 행렬의영역 {
    private static int[][] visited; // 방문여부
    private static int cnt = 0; //영역의 크기 계산

    private static void solution(int sizeOfMatrix, int[][] matrix) {
        visited = new int[sizeOfMatrix][sizeOfMatrix];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < sizeOfMatrix; i++)
        {
            for (int j = 0; j < sizeOfMatrix; j++)
            {
                //영역의 원소가 1 이고, 방문하지 않은 곳
                if (matrix[i][j] == 1 && visited[i][j] == 0) {
                    dfs(i, j, matrix);
                    list.add(cnt); //영역의 개수계산을 위해
                    cnt = 0;
                }
            }
        }
        Collections.sort(list); // 영역은 오름차순으로 출력
        System.out.println(list.size());
        for(int i : list)
        {
            System.out.print(i + " ");
        }
    }

    private static void dfs(int x, int y, int[][] matrix)
    {
        //방문하면 1
        visited[x][y] = 1;
        //방문한 곳은 0으로 초기화, 방문한곳은 방문하게 안하기 위해
        matrix[x][y] = 0;
        //우
        if (x + 1 < visited.length && visited[x + 1][y] == 0 && matrix[x + 1][y] == 1) {
            dfs(x + 1, y, matrix);
        }
        //상
        if (y + 1 < visited.length && visited[x ][y + 1] == 0 && matrix[x][y + 1] == 1){
            dfs(x, y + 1, matrix);
        }
        //좌
        if (x - 1 >= 0 && visited[x - 1][y] == 0 && matrix[x - 1][y] == 1)
        {
            dfs(x - 1, y, matrix);
        }
        //하
        if (y - 1 >= 0 && visited[x][y - 1] == 0 && matrix[x][y - 1] == 1)
        {
            dfs(x, y -1, matrix);
        }
        cnt++;
    }

    public static void main(String[] args) {
        int[][] map = {{1,1,1,0,1},
                {1,1,0,0,1},
                {1,0,1,1,0},
                {0,0,1,1,1},
                {0,0,1,1,1}};
        solution(5,map);
    }
}
