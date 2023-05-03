package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BOJ 11720
 */
public class 숫자의합구하기001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split("");
        int answer = 0;
        for (String num : nums) {
            if (num.equals("0")) {
                continue;
            }
            answer += Integer.parseInt(num);
        }

        System.out.println(answer);
    }
}
