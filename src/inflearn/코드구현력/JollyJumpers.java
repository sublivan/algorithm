package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N개의 정수로 이루어진 수열에 대해 서로 인접해 있는 두 수의 차가 1에서 N-1까지의 값을
 * 모두 가지면 그 수열을 유쾌한 점퍼(jolly jumper)라고 부른다
 * 다음과 같은 수열에서 1 4 2 3 앞 뒤에 있는 숫자 차의
 * 절대 값이 각각 3 ,2, 1이므로 이 수열은 유쾌한 점퍼가 된다.
 */
public class JollyJumpers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] jumperCheck = new int[N];

        String answer = "YES";
        for (int i = 0; i < nums.length - 1; i++) {
            int now = nums[i];
            int next = nums[i + 1];

            int calc = Math.abs(now - next);

            if (calc > 0 && calc < N && jumperCheck[calc] == 0) {
                jumperCheck[calc] = 1;
            } else {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
