package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ 11720
 */
public class 숫자의합구하기001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char[] nums = input.toCharArray();
        int answer = 0;
        for (char num : nums) {
            answer += num - '0';
        }
        System.out.println(answer);
    }
}
