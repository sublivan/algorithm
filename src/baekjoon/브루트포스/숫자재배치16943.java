package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자재배치16943 {

    static boolean[] visited;
    static int[] arrA;
    static int B;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        String A = input[0];
        B = Integer.parseInt(input[1]);

        arrA = new int[A.length()];

        for (int i = 0; i < A.length(); i++) {
            arrA[i] = A.toCharArray()[i] - '0';
        }

        answer = -1;
        visited = new boolean[arrA.length];
        permutation(0, 0);
        System.out.println(answer);

        //1234 3456 -> 3421
    }

    static void permutation(int num, int depth) {
        if (depth == arrA.length) {
            answer = Math.max(num, answer);
            return;
        }

        for (int i = 0; i < arrA.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (depth == 0 && arrA[i] == 0) { // 맨앞자리수인데 0인경우
                continue;
            }
            if (num * 10 + arrA[i] > B) { // 다음수가 B 보다 큰 경우
                continue;
            }
            visited[i] = true;
            permutation(num * 10 + arrA[i], depth + 1);
            visited[i] = false;
        }
    }
}
/**
 * 두 정수 A와 B가 있을 때, A에 포함된 숫자의 순서를 섞어서 새로운 수 C를 만들려고 한다.
 * 즉, C는 A의 순열 중 하나가 되어야 한다.
 *
 * 가능한 C 중에서 B보다 작으면서, 가장 큰 값을 구해보자. C는 0으로 시작하면 안 된다.
 *
 * 입력
 * 첫째 줄에 두 정수 A와 B가 주어진다.
 *
 * 출력
 * B보다 작은 C중에서 가장 큰 값을 출력한다. 그러한 C가 없는 경우에는 -1을 출력한다.
 */