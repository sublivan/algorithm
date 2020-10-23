package programmers.level1;

import java.util.*;

public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (!list.contains(sum))
                    list.add(sum);
            }

        }
        int[] answer = new int[list.size()];
        for(int i =0 ; i< list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
