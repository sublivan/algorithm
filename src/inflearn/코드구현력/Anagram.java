package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 아나그램, 구글 인터뷰 문제
 * Anagram이란 두 문자열이 알파벳의 나열 순서는 다르지만 그 구성이 일치하면
 * 두 단어는 아나그램이라고 한다.
 * ex) AbaAeCe baeeACA 는 아나그램
 */
public class Anagram {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInputs = br.readLine().split("");
        String[] lastInputs = br.readLine().split("");

        Arrays.sort(firstInputs);
        Arrays.sort(lastInputs);

        if (firstInputs.length != lastInputs.length) {
            return;
        }
        String answer = "YES";

        for (int i = 0; i < firstInputs.length; i++) {
            if (!firstInputs[i].equals(lastInputs[i])) {
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
    }
}
