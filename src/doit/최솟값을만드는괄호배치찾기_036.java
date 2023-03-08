package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * +, -, 괄호를 이용해 수식을 만들었다.
 * 이 괄호를 모두 지우고, 다시 적절히 괄호를 넣어 수식의 값을 최소로 만들고자 한다. 이 최솟값을 반환하라
 *
 * 입력
 * - 연산식
 * (0~9, +, -로 구성; 가장 처음과 마지막 문자는 숫자; 연속해서 2개 이상의 여난자가 나타나지 않는다;
 * 5자리보다 많이 연속되는 숫자는 없다; 주어진 연삭식의 길이는 50보다 작거나 같다)
 */
public class 최솟값을만드는괄호배치찾기_036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] minusSplit = input.split("-");
        int answer = Integer.parseInt(minusSplit[0]); // 첫 문자는 숫자

        for (int i = 1; i < minusSplit.length; i++) {
            int plusCal = calculator(minusSplit[i]); // + 수식 계산
            answer = answer - plusCal; // 최솟값을 위해 '+ 수식 계산 결과'를 음수로 만들어 계산
        }
        System.out.println(answer);
    }

    private static int calculator(String str) {
        String[] plusSplit = str.split("[+]");
        int sum = 0;
        for (String num : plusSplit) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
