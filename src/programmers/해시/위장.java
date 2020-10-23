package programmers.해시;

import java.util.*;

public class 위장 {
    public int solution(String[][] clothes)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < clothes.length; i++)
        {
            String key = clothes[i][1];
            if(map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }

        int answer = 1;
        for(int value : map.values())
            answer *= (value + 1);

        answer -= 1;
        return answer;
    }
}
