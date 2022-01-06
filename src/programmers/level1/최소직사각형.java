package programmers.level1;

public class 최소직사각형 {

    public static void main(String[] args) {
        int[][] input = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println("result : " + new 최소직사각형().solution(input));


    }
    public int solution(int[][] sizes) {

        int maxWide = 0;
        int maxHigh = 0;
        for (int i = 0; i < sizes.length; i++) {
            int wide = Math.max(sizes[i][0], sizes[i][1]);
            int high = Math.min(sizes[i][0], sizes[i][1]);
            maxWide = Math.max(maxWide, wide);
            maxHigh = Math.max(maxHigh, high);
        }

        return maxWide * maxHigh;
    }
}

/**
 * 가장 큰 가로, 가장 긴 세로를 구하면되는 간단한 문제이다.
 * 가로와 세로의 구분을 짓지말고 전체 길이들에서 가장 긴 가로와 가장 긴 세로를 찾으면된다.
 */
