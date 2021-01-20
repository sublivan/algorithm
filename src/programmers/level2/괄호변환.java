package programmers.level2;

public class 괄호변환 {
    public String solution(String w) {
        if (w.length() == 0) {
            return "";
        }

        int cutIndex = division(w);
        String u = w.substring(0, cutIndex);
        String v = w.substring(cutIndex);

        if (isCorrectString(u)) {
            return u + solution(v);
        } else {
            String tmp = "(" + solution(v) + ")";
            u = u.substring(1, u.length() - 1);
            return tmp + reverse(u);
        }
    }

    public static String reverse(String w) {
        StringBuilder sb = new StringBuilder();

        for (char c : w.toCharArray()) {
            if (c == '(') {
                sb.append(")");
            } else if (c == ')'){
                sb.append("(");
            }
        }
        return sb.toString();
    }

    public static int division(String w) {
        int open = 0;
        int close = 0;
        int cutIndex;

        for (cutIndex = 0; cutIndex < w.length(); cutIndex++) {
            char compare = w.charAt(cutIndex);

            if (compare == '(') {
                open++;
            } else if (compare == ')') {
                close++;
            }
            if (open == close) {
                return cutIndex + 1;
            }
        }
        return cutIndex;
    }

    public static boolean isCorrectString(String w) {
        int correctCnt = 0;

        for (char c : w.toCharArray()) {
            if (c == '(') {
                correctCnt++;
            } else if (c == ')') {
                correctCnt--;
            }
            if (correctCnt < 0) { // 시작이 닫는 괄호일
                return false;
            }
        }
        if (correctCnt == 0) { // 올바른 괄호일때
            return true;
        }
        return false;
    }

}

/*
모든 괄호를 뽑아서 올바른 순서대로 배치된 괄호 문자열을 알려주는 프로그램을 개발하려고한다

'(' ')'의 개수가 같다면 이를 균형잡힌 괄호 문자열 이라고 부른다

'(' ')'의 괄호의 짝도 모두 맞을 경우에는 이를 올바른 괄호 문자열 이라고 부른다.

예를 들어,
(()))( 와 같은 문자열는 균형잡힌 괄호 문자열이지만 올바른 괄호 문자열은 아니다.
(())() 와 같은 문자열은 군형잡힌 괄호 문자열이면서 올바른 괄호 문자열이다.
 */


/*

String 재귀(String w) {
    If (w 빈 문자열)
         return “”;

    index = division(w);

    U. = 가장최소로 균형잡힌 괄호문자열
    v. = u를 제외한 나머지

    if (올바른 문자열일때)
    {
       Return u + 재귀(v)
    }
    else  U가 올바르지 않은 괄호 문자열일때
    {
       새로운 문자열 = “(“ + 재귀(v) + “)”.
       U = 첫번째 마지막 제외한 나머지 문자열
       Return 위에 만든 새로운 문자열 + 각 괄호의 방향을 바꾼 u
    }
}
 */