package programmers.level2;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = people.length;

        Arrays.sort(people);
        int lightWeightIdx = 0;

        for (int highWeightIdx = people.length - 1; highWeightIdx > lightWeightIdx; highWeightIdx--) {
            if (people[lightWeightIdx] + people[highWeightIdx] <= limit) {
                answer--;
                lightWeightIdx++;
            }
        }
        return answer;
    }
}
