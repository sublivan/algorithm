package programmers.level3;

import java.util.*;

public class 야근지수{
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : works)
        {
            pq.add(i);
        }
        while(n != 0)
        {
            if (pq.peek() != 0)
                pq.add(pq.poll() - 1);
            n--;
        }
        long answer = 0;
        for (int value : pq)
        {
            answer += Math.pow(value, 2);
        }
        return answer;
    }
}
