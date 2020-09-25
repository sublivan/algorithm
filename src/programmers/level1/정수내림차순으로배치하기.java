package programmers.level1;

import java.util.*;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String v : str)
        {
           sb.append(v);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}
