package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 각 선우의 입장에서 자기보다 앞에 달리고 있는 선수들 중 평소 실력이 자기보다 좋은 선수를
 * 남은 거리동안 앞지르는 것은 불가능
 * 반대로, 평소 실력이 자기보다 좋지 않은 선수가 앞에 달리고 있으면 남은 거리 동안 앞지르는 것이 가능
 *
 * 평소 실력은 정수값으로 주어진다. 더 큰 값이 더 좋은 실력을 의미한다.
 * 평소 실력은 같을 수 있다. 실력이 같다면 앞에 달리는 선수를 앞지를 수 없다.
 *
 * 자신이 앞으로 얻을 수 있는 최선의 등수를 구하라
 */
public class 마라톤 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] runners = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[8];
        Arrays.fill(result, 1);

        for (int i = 1; i < N; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (runners[i] <= runners[j]) {
                    result[i] += 1;
                }
            }
        }
        System.out.println("result = " + Arrays.toString(result));
    }
}

/**
 * [예제]
 * 입력
 * 8
 * 2 8 10 7 1 9 4 15
 *
 * 출력
 * 1 1 1 3 5 2 5 1
 */