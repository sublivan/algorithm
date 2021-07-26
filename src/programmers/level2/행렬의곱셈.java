package programmers.level2;

import java.util.Arrays;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] answer = new 행렬의곱셈().solution(arr1, arr2);
        for (int[] ans : answer) {
            System.out.println(Arrays.toString(ans));
        }

        System.out.println("\n기대값");
        System.out.println("[15, 15]\n[15, 15]\n[15, 15]");
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[ arr1.length][arr2[0].length];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr2[0].length; col++) {
                for (int idx = 0; idx < arr2.length; idx++) {
                    answer[row][col] += arr1[row][idx] * arr2[idx][col];
                }
            }
        }
        return answer;
    }
}
