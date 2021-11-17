package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 숫자문자열과영단어 {

    public int solution(String s) {
        Map<String, Integer> convertMap = new HashMap<>() {
            {
                put("zero", 0);
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);
            }
        };

        for (String number : convertMap.keySet()) {
            if (s.contains(number)) {
                s = s.replaceAll(number, String.valueOf(convertMap.get(number)));
            }
        }

        return Integer.parseInt(s);
    }
}
