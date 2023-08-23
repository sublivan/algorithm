package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * BOJ 1253
 */
public class 좋은수구하기008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(nums);
        int count = 0;
        for (int k = 0; k < N; k++) {
            long find = nums[k];
            int i = 0;
            int j = N - 1;
            while (i < j) {
                if (nums[i] + nums[j] == find) {
                    if (i != k && j != k) {
                        count++;
                        break;
                    } else if (i == k) {
                        i++;
                    } else if (j == k) {
                        j--;
                    }
                } else if (nums[i] + nums[j] < find) {
                    i++;
                } else if (nums[i] + nums[j] > find) {
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}
