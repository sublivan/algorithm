package programmers.스택_큐;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class 주식가격 {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2 ,3};

        System.out.println(Arrays.toString(solution(prices)));
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int time;
        for(int i = 0; i < prices.length; i++)
        {
            time = 0;
            for(int k = i + 1; k < prices.length; k++)
            {
                if(prices[i] <= prices[k])
                    time++;
                else{
                    time++;
                    break;
                }
            }
            answer[i] = time;
        }
        return answer;
    }
}
