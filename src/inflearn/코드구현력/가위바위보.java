package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * A, B 두 사람이 가위바위보 게임을 한다.
 * 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
 * B가 이기면 B를 출력한다. 비길 경우에는 D를 출력한다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하자
 */
public class 가위바위보 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < N; i++) {
            if (A[i] == B[i]) {
                System.out.println("D");
            } else if (A[i] == 1 && B[i] == 3) {
                System.out.println("A");
            } else if (A[i] == 2 && B[i] == 1) {
                System.out.println("A");
            } else if (A[i] == 3 && B[i] == 2 ) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
