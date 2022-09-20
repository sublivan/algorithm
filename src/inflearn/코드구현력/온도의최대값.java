package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 온도의최대값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        int[] temperature = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int max = 0;
        for (int i = 0; i <= temperature.length - K; i++) {
            sum = 0;
            for (int j = i; j < K + i; j++) {
                sum += temperature[j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("max : " + max);
    }
}
