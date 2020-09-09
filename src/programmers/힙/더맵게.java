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
            pq.add(v);
        }
        System.out.println(Arrays.toString(pq.toArray()));

        boolean flag = true;
        for(int i = 0; i < pq.size(); i++)
        {
            if(pq.peek() > K)
                break;
            for(int j = 0; j < pq.size(); j++)
            {
                if(pq.peek() < K)
                {
                    pq.add(pq.poll() + pq.poll() * 2);
                    answer++;
                }
            }
        }
        return answer;
    }
}
