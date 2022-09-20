package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 앞자리에 앉은 키가 큰 학생이 앉으면 그 학생보다 앉은키가 작은 뒷자리 학생은 스크린이 보이지 않습니다.
 * 한 줄에 앉은키 정보가 주어지면 뒷사람 모두의 시야를 가려 영화 시청이 불가능하게 하는
 * 분노유발자가 그 줄에 몇 명이 있는지 구하는 프로그램을 작성하세요.
 */
public class 분노유발자 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int[] students = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < N - 1; i++) {
            int now = students[i];
            cnt++;
            for (int j = i + 1; j < N; j++) {
                int next = students[j];

                if (now < next) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
