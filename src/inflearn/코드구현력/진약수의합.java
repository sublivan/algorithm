package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 N이 주어지면 자연수 N의 진약수의 합을 수식과 함께 출력
 * 
 * 진약수 : 어떤 자연수 n의 약수들 중에서 자기 자신인 n을 제외한 약수
 */
public class 진약수의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 1;
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= N / 2; i++) { // 약수는 항상 N/2 보다 작거나 같다.
            if (N % i == 0) {
                sum += i;
                sb.append(" + " + i);
            }
        }
        sb.append(" = ");
        System.out.println(sb.toString() + sum);
    }
}
