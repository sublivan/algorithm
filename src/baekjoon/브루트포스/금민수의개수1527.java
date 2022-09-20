package baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 금민수의개수1527 {

    static int A, B, cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputString = br.readLine().split(" ");
        A = Integer.parseInt(inputString[0]);
        B = Integer.parseInt(inputString[1]);

        dfs(0);
        System.out.println(cnt);

        br.close();
    }

    public static void dfs(long num) {

        if (num > B) {
            return;
        }
        if (num >= A && num <= B) {
            cnt++;
        }

        // 무조건 4와 7이 들어간 수로 만들어서 계산
        dfs(num * 10 + 4);
        dfs(num * 10 + 7);
    }
}

/**
 * 은민이는 4와 7을 좋아하고, 나머지 숫자는 싫어한다.
 * 금민수는 어떤 수가 4와 7로만 이루어진 수를 말한다.
 * 
 * A와 B가 주어졌을때, A보다 크거나 같고 B보다 작거나 같은 자연수 중에 금민수 인 것의 갯수 출력
 * 
 * 1 ~ 10
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * 금민수 : 4, 7 => 2개
 */
