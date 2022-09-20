package programmers.정렬;

import java.util.*;

public class 가장큰수 {
    public static void main(String[] args)
    {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {

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
        String answer = "";

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

//    public static String solution(int[] numbers) {
//
//        List<String> nums = new ArrayList<>();
//
//        for (int number : numbers) {
//            nums.add(String.valueOf(number));
//        }
//
//        Collections.sort(nums, (o1, o2) -> {
//            return (o2 + o1).compareTo(o1 + o2);
//        });
//
//        System.out.println("nums = " + nums);
//
//        StringBuilder answer = new StringBuilder();
//        for (String num : nums) {
//            answer.append(num);
//        }
//
//        if (answer.charAt(0) == '0') {
//            return "0";
//        }
//        return answer.toString();
//    }
}
/*
현재수와 다음수를 위치를 바꿔가며 더한 값을 비교하여 내림차순 하는게 핵심
 */