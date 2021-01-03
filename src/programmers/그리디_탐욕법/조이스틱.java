package programmers.그리디_탐욕법;

import java.util.Arrays;

public class 조이스틱 {
    public static void main(String[] args) {
        조이스틱 main = new 조이스틱();
        System.out.println(main.solution("JEROEN"));
        System.out.println("기대값: 56");

    }

    public int solution(String name) {
        int answer = 0;

        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char)(65 + i);
        }

        System.out.println(Arrays.toString(alpha));






        return answer;
    }
}
