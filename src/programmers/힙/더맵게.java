package programmers.힙;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args)
    {
        int[] scoville = {1, 2, 3, 9, 10 ,12};
        int k = 7;
        System.out.println(solution(scoville, k));
    }
    public static int solution(int[] scoville, int K)
    {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int v : scoville)
        {
            pq.offer(v);
        }
        while(pq.peek() <= K)
        {
            if(pq.size() == 1)
                return -1;

            int a = pq.poll();
            int b = pq.poll();

            int result = a + (b * 2);
            pq.offer(result);
            answer++;
        }
        return answer;
    }
}

/*
PriorityQueue 는 최소힙

 */