package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * N(2<= n <= 100)명의 나이가 입력된다.
 * 이 N명의 사람 중 가장 나이차이가 많이 나는 경우는 몇 살일까.
 * 최대 나이 차이를 출력하는 프로그램을 작성하라
 */
public class 나이차이 {

    public static void main(String[] args) throws IOException {

        System.out.println(solution1(new BufferedReader(new InputStreamReader(System.in))));
        System.out.println(solution2(new BufferedReader(new InputStreamReader(System.in))));
    }

    // 방법1
    public static int solution1(BufferedReader br) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> numList = new ArrayList<>();

        for (int i = 0;i < N; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(numList);
        int min = numList.get(0);
        int max = numList.get(N - 1);

        return max - min;
    }

    // 방법2
    public static int solution2(BufferedReader br) throws IOException {

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }
}
