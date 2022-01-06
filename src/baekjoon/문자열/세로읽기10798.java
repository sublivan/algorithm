package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세로읽기10798 {

    static final int MAX_ROW_SIZE = 5;
    static final int MAX_COL_SIZE = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_length = Integer.MIN_VALUE;

        char[][] cArr = new char[MAX_ROW_SIZE][MAX_COL_SIZE];

        for (int row = 0; row < MAX_ROW_SIZE; row++) {
            String s = br.readLine().trim();
            max_length = Math.max(s.length(), max_length);

            for (int col = 0; col < s.length(); col++) {
                cArr[row][col] = s.charAt(col);
            }
        }

        printAnswer(cArr, max_length);
    }

    private static void printAnswer(char[][] cArr, int max_length) {
        for (int i = 0; i < max_length; i++) {
            for (int j = 0; j < MAX_ROW_SIZE; j++) {
                if (cArr[j][i] == '\0') {
                    continue;
                }
                System.out.print(cArr[j][i]);
            }
        }
    }
}

