package doit;

import java.io.IOException;
import java.util.Scanner;

/**
 * BOJ 1546
 */
public class 평균구하기002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] scores = new int[N];
        int max = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            if (max < scores[i])
                max = scores[i];
            sum += scores[i];
        }

        double answer = (sum / max * 100) / N;
        System.out.println(answer);
    }
}
