package doit.자료구조;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 평균구하기002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(scores);
        int maxScore = scores[N - 1];

        long sum = 0;
        for (long score : scores) {
            sum += score;
        }
        System.out.println(sum * 100.0 / maxScore / N);
    }
}
