package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N개의 자연수가 입력되면 각 자연수의 자릿수의 합을 구하고,
 * 그 합이 최대인 자연수를 출력하는 프로그램을 작성
 *
 */
public class 자릿수의합 {

    static int digit_sum(int x) {
        int sum = 0;

        while (x  > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        int maxNumIndex = 0;

        for (int i = 0; i < N; i++) {
            int now = nums[i];
            int sum = digit_sum(now);

            if (sum == max) {
                int pre = nums[maxNumIndex];

                maxNumIndex = now > pre ? i : maxNumIndex;
            }
            if (sum >= max) {
                maxNumIndex = i;
                max = sum;
            }
        }
        System.out.println(nums[maxNumIndex]);
    }
}
