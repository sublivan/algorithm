package 문자열;

/*
문제 : 반복되는 문자열을 개수를 세고 압축하는 메소드를 작성하라.
만약 기존의 문자열보다 압축한 문자열이 더 길면 기존의 문자열을 반환한다.
입력 : aabccccaaa
출력 : a2b1c4a3
 */

public class 문자열압축 {
    public static void main(String[] args) {
        String[] input = {"aabccccaaa", "", "abcdee"};
        for (String value : input)
        {
            System.out.println(solution(value));
        }
    }

    public static String solution(String s)
    {
        if(s.isEmpty())
            return null;

        char[] carr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        char now = carr[0];
        int word_cnt = 1;

        for (int i = 1; i < carr.length; i++)
        {
            if (now == carr[i]) {
                word_cnt++;
            }
            else
            {
                sb.append(now);
                sb.append(word_cnt);
                word_cnt = 1;
                now = carr[i];
            }
        }
        sb.append(now);
        sb.append(word_cnt);

        if (sb.length() > s.length())
            return s;
        return sb.toString();
    }
}
