package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 선생님은 각 학생들에게 숫자가 적힌 카드를 줬습니다. 
 * 각 학생들은 1부터 자기 카드에 적힌 숫자까지의 합을 구하는 퀴즈입니다.
 * 학생들의 답이 맞았는지 확인하는 프로그램 작성
 */
public class 선생님퀴즈 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int answer = Integer.parseInt(st.nextToken());

            int calResult = getTotalSum(num);

            isEqual(answer, calResult);
        }
        br.close();
    }

    private static void isEqual(int answer, int calResult) {
        if (calResult == answer) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /**
     * 등차수열의 합
     * 첫항 1, 공차 1, 마지막항 num
     * @param num
     * @return 등차수열의 합
     */
    private static int getTotalSum(int num) {
        return num * (num + 1) / 2;
    }

}
