package doit;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [소수구하기]
 * boj 1929
 *
 * M이상 N이하의 소수를 모두 출력하라
 * 입력
 * - 시작 수 M, 종료수 N
 */
public class 소수구하기037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        if (M > N) {
            System.out.println("종료수가 시작수보다 큽니다.");
            return;
        }
        
        int[] nums = new int[N+1];
        for (int i = 2; i <= N; i++) {
            nums[i] = i;
        }
        System.out.println("Before : " + Arrays.toString(nums));
        primeNumber(nums, N);
        System.out.println("After : " + Arrays.toString(nums));
        for (int i = M; i < N; i++) {
            if (nums[i] != 0)
                System.out.print(nums[i] + " ");
        }
    }


    private static void primeNumber(int[] nums, int N) {
        for (int i = 2; i <= Math.sqrt(N); i++) { // 종료수의 제곱근 까지만 계산
            if (nums[i] == 0)
                continue;
            for (int j = i + i; j <= N ; j += i) {
                nums[j] = 0;
            }
        }
    }
}
