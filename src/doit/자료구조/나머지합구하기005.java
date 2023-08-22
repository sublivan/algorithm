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

        st = new StringTokenizer(br.readLine());

        int sum = 0;
        long[] calCnts = new long[M];
        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            calCnts[sum]++;
        }

        long answer = calCnts[0];
        for (long calCnt : calCnts) {
            answer += (calCnt * (calCnt - 1) / 2);
        }

        System.out.println(answer);
    }
}
