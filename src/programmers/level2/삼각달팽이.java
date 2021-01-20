package programmers.level2;

import java.util.Arrays;

public class 삼각달팽이 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 삼각달팽이().solution(4)));
    }

    public int[] solution(int n) {
        int[][] triangle = triangleInit(n);
        int length = getMaxNum(n);
        int[] answer = new int[length];
        int index = 0;

        for (int[] row : triangle) {
            for (int col : row) {
                if (col != 0) {
                    answer[index++] = col;
                }
            }
        }
        return answer;
    }

    public static int[][] triangleInit(int n) {
        int x = -1;
        int y = 0;
        int inputNum = 1;
        int[][] tmpTriangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                tmpTriangle[x][y] = inputNum++;
            }
        }
        return tmpTriangle;
    }

    public static int getMaxNum(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt += i;
        }
        return cnt;
    }
}

/*
등차수열
- n * (n + 1) / 2
- n번째 까지의 항의 갯수
/*

달팽이 채우기 과정

3가지
1. 세로 채우기
2. 가로 채우기
3. 대각선 채우기

max값까지 과정을 반복하여 달팽이를 채운다.

 */
