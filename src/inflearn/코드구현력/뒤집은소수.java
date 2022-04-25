package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 수를 출력하는 프로그램 작성
 *
 */
public class 뒤집은소수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int reverseNum = reverse(Integer.parseInt(st.nextToken()));
            if (isPrime(reverseNum)) {
                sb.append(reverseNum + " ");
            }
        }
        System.out.println(sb.toString());
    }

    static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }

    static boolean isPrime(int x) {
        for (int i = 2; i < (int)Math.sqrt(x); i++) {
            if (x % i == 0) {
                 return false;
            }
        }
        return true;
    }
}
