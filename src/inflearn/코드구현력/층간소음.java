package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 한 세대의 측정치가 M값을 넘으면 세대호수와 작은 경보음이 관리실 모니터에서 울립니다.
 * 한 세대의 N초 동안의 실시간 측정치가 주어지면 최대 연속으로 경보음이 울린 시간을 구하세요.
 * 경보음이 없으면 -1를 출력합니다.
 * 
 * 입력
 * 10 90
 * 23 17 120 34 112 136 123 23 25 113
 *
 * 출력
 * 3
 */
public class 층간소음 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        int[] noises = Arrays.stream(input.split( " ")).mapToInt(Integer::parseInt).toArray();

        int max = Integer.MIN_VALUE;
        int alarm = 0;
        for (int i = 0; i < N; i++) {
            int now = noises[i];
            if (now > M) {
                alarm++;
            } else {
                alarm = 0;
            }
            if (alarm > max) {
                max = alarm;
            }
        }
        if (max == 0) {
            max = -1;
        }
        System.out.println("최대 경보지속 시간 = " + max + "초");
    }
}
