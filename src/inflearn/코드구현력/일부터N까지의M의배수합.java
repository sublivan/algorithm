package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 N이 입력되면 1부터 N까지의 수 중 M의 배수합을 출력
 */
public class 일부터N까지의M의배수합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        int sum = 0;
        for (int i = M; i <= N; i++) {
            if (i % M == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
