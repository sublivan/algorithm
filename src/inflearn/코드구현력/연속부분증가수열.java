package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N개의 숫자가 나열된 수열이 주어집니다.
 * 이 수열 중 연속적으로 증가하는 부분 수열을 최대 길이를 구하여 출력하는 프로그램을 작성하세요.
 * input
 * 9
 * 5 7 3 3 12 12 13 10 11
 *
 * output
 * 5
 */
public class 연속부분증가수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = Arrays.stream(br.readLine().split( " ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
        int upCnt = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int now = nums[i];
            int next = nums[i + 1];

            upCnt++;
            if (now > next) {
                upCnt = 1;
            }
            if (max < upCnt) {
                max = upCnt;
            }
        }
        System.out.println(max);

    }

}
