package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 주몽의명령007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] parts = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(parts);

        int count = 0;
        int i = 0;
        int j = N - 1;

        while (i < j) {
            if (parts[i] + parts[j] > M) {
                j--;
            } else if (parts[i] + parts[j] < M) {
                i++;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
