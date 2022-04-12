package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
 * 만들어진 자연수와 그 자연수의 약수 개수를 출력한다.
 *
 * 첫 자리 0은 자연수화화 할때 무시한다.
 */
public class 숫자만추출 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char input : inputs) {
            if (input >= '0' && input <= '9') {
                sb.append(input);
            }
        }

        int num = Integer.parseInt(sb.toString());
        int cnt = getDivisorCount(num);

        System.out.print(num + "\n" + cnt);
    }

    private static int getDivisorCount(int num) {
        int cnt = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
