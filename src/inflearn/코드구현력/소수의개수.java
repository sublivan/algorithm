package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램
 * N(2<= N <= 200,000)
 */
public class 소수의개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int primeCount = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        System.out.println("소수의 개수 = " + primeCount);

    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
