package programmers.스택_큐;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[progresses.length];

        for(int i = 0; i < progresses.length; i++)
        {
           if((100 - progresses[i]) % speeds[i] == 0)
           {
               days[i] = (100 - progresses[i]) / speeds[i];
           }
           else
               days[i] = (100 - progresses[i]) / speeds[i] + 1;
        }
        ArrayList<Integer> result = new ArrayList<>();

        int cnt;
        int j = 0;
        for(int i = 0; i < days.length; i++)
        {
            cnt = 0;
            for(j = i + 1; j < days.length; j++)
            {
                if(days[i] < days[j])
                {
                    i = j - 1;
                    break;
                }
                cnt++;
            }
            result.add(cnt + 1);
            if(j == days.length) break;
        }
        answer = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++)
        {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
