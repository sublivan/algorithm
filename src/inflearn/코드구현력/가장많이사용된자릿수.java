package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N자리 자연수가 입력되면 입력된 자연수의 자릿수 중 가장 많이 사용된 숫자를 출력하는 프로그램작성
 *
 */
public class 가장많이사용된자릿수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split("");
        int[] numBucket = new int[10];

        for (String input : inputs) {
            int num = Integer.parseInt(input);

            numBucket[num] += 1;
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < numBucket.length; i++) {
            int now = numBucket[i];
            if (max < now) {
                max = now;
                maxIndex = i;
            }
        }
        System.out.println("numBucket = " + Arrays.toString(numBucket));
        System.out.println(maxIndex);
    }
}
