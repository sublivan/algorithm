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
/*
가장 작업량이 많은 것을 하나씩 해치우는게 포인트

우선순위큐를 사용하였다.
우선순위 큐는 오름차순
내림차순으로 변경하기 위해서는
Collections.reverseOrder()를 사용해야 한다.

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 */