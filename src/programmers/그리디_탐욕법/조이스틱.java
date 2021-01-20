package programmers.그리디_탐욕법;

import java.util.Arrays;

public class 조이스틱 {
    public static void main(String[] args) {
        조이스틱 main = new 조이스틱();
        System.out.println("결과값: " + main.solution("JEROEN"));
        System.out.println("기대값: 56");

    }

    public int solution(String name) {
        int answer = 0;

        char[] alpha = new char[26];

        for (int i = 0; i < 26; i++) {
            alpha[i] = (char)(65 + i);
        }

        System.out.println(Arrays.toString(alpha));

        // 위 아래 최소이동
        for (char c : name.toCharArray()) {
            int up = c - 'A';
            int down =  1 + 'Z' - c;
            answer += Math.min(up, down);
        }

        // A가 아닌 모든 문자를 돌릴 수 있는 최소 좌우 이동
        // 모든 위치에서 역으로 돌아가는 경우 최소를 찾는다.
        int minMove = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                int next = i +  1;
                if (next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                minMove = Math.min(move, minMove);
            }
        }

        return answer + minMove;
    }
}
