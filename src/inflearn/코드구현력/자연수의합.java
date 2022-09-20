package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 자연수 A, B가 주어지면 A부터 B까지의 합을 수식과 함께 출력
 */
public class 자연수의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B || A == B || A < 1 || B > 100) {
            System.out.print("유효하지 않은 입력값");
            return;
        }

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = A; i <= B; i++) {
            sum += i;
            sb.append(i);
            if (i != B) {
                sb.append(" + ");
            }
        }
        sb.append(" = ");
        System.out.print(sb.toString() + sum);
    }
}
