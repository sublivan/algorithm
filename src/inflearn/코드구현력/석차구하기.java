package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N명의 학생의 수학점수가 입력되면 각 학생의 석차를 입력된
 * 순서대로 출력하는 프로그램을 작성
 */
public class 석차구하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            int cnt = 1;
            int now = nums[i];
            for (int j = 0; j < N; j++) {
                if (now < nums[j]) {
                    cnt++;
                }
            }
            rank[i] = cnt;
        }
        System.out.println("석차 = " + Arrays.toString(rank));
    }
}
