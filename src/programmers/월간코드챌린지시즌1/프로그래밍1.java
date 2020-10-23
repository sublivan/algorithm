package programmers.월간코드챌린지시즌1;

import java.util.*;

public class 프로그래밍1 {
    public int[] solution(int[] numbers) {
        int[] answer;

        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < numbers.length; i++)
        {
            for(int j = i + 1; j < numbers.length; j++)
            {
                int sum = numbers[i] + numbers[j];
                if(!list.contains(sum))
                    list.add(sum);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i =0 ; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
/*
(통과)
정수 배열 numbers가 주어집니다.
numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는
모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

numbers	    result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]
 */
