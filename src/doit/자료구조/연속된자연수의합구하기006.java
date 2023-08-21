package doit.자료구조;

import java.util.Scanner;

/**
 * 투 포인터
 * sum > N  : sum = sum-start_index; start_index++
 * sum < N  : end_index++; sum = sum + end_index
 * sum == N : end_index++; sum = sum + end_index; count++
 */
public class 연속된자연수의합구하기006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;

        int start = 1;
        int end = 1;
        long sum = 1;
        while (end != N) {
            if (sum > N) {
                sum = sum - start;
                start++;
            } else if (sum < N) {
                end++;
                sum += end;
            } else {
                end++;
                sum += end;
                count++;
            }
        }
        System.out.println(count);
    }
}
