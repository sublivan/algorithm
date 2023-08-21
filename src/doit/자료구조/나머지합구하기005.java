package doit.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * BOJ 10986
 */
public class 나머지합구하기005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] sums = new int[N];

        st = new StringTokenizer(br.readLine());
        sums[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            sums[i] = (sums[i-1] + Integer.parseInt(st.nextToken())) % M;
        }

        int answer = 0;
        int[] calCnts = new int[M];
        int zero = 0;
        for (Integer remainder : sums) {
            if (remainder == 0) {
                zero++;
            }
            calCnts[remainder]++;
        }

        for (Integer calCnt : calCnts) {
            answer = answer + (calCnt * (calCnt - 1) / 2);
        }
        answer += zero;

        System.out.println(answer);
    }
}
