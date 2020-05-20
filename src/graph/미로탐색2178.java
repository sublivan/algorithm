package graph;

import java.util.*;
import java.io.*;

public class 미로탐색2178 {

    static int n, m;
    static int[][] map;
    static int[][] check;
    static int[] dx = {1, 1, 1, 0, 0};
    static int[] dy = {1, 0, -1, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        check = new int[n][m];

        for(int i=0; i<n; i++){
            String[] str = sc.next().split("");
            for(int j=0; j<m ; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

    }
    static void bfs(int x, int y){

    }





}

/*
참고

 */