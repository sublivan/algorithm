package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str);
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String v : str)
            sb.append(v);
        answer = sb.toString();
        return answer;
    }

//    char 배열을 이용하여 풀기
//    public String solution(String s) {
//
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//
//        String answer = new StringBuilder(new String(ch)).reverse().toString();
//        return answer;
//    }
}
