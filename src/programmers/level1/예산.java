package programmers.level1;
import java.util.*;

public class 예산 {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for(int i = 0; i < d.length; i++)
        {
            sum += d[i];
            if(sum > budget)
            {
                answer = i;
                break;
            }
        }
        if(sum <= budget)
        {
            answer = d.length;
        }
        return answer;
    }
}
