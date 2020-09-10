package programmers.완전탐색;

// 해결못함
import java.util.*;

public class 소수찾기_x {
    public static void main(String[] args)
    {
        String numbers = "17";
        System.out.println(solution(numbers));
    }

    static List<Integer> list = new ArrayList<>();

    public static int solution(String numbers) {
        int answer = 0;

        String[] nums = numbers.split("");
        for(int value : list)
        {
            if(value > 2)
            {
                answer++;
            }
        }
        return answer;
    }
    public static boolean prime(int num)
    {
        if(num <= 1)
            return false;
        else if(num == 2 || num == 3)
            return true;
        else if(num % 2 == 0 || num % 3 == 0)
            return false;
        return true;
    }
}
