package programmers.정렬;

import java.util.*;

public class 가장큰수 {
    public static void main(String[] args)
    {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers) {
        String answer = "";

        String max;

        String[] num = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++)
        {
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2)
            {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        int check = 0;
        for(int i = 0; i < num.length; i++)
        {
            answer += num[i];
            check += Integer.parseInt(num[i]);
        }
        if(check == 0)
        {
            answer = "0";
        }
        return answer;
    }
}
/*
현재수와 다음수를 위치를 바꿔가며 더한 값을 비교하여 내림차순 하는게 핵심
 */