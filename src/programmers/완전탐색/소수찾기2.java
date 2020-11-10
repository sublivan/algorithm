package programmers.완전탐색;

// 해결못함
import java.util.*;

public class 소수찾기2 {
    static int[] nums;
    static int[] countArr;
    static int answer = 0;

    public int solution(String numbers) {
        String[] str;
        int n;

        n = numbers.length();
        str = numbers.split("");
        nums = new int[n];
        for (int i = 0; i < str.length; i++)
        {
            nums[i] = Integer.parseInt(str[i]);
        }
        comb(0, 0 , 0);
        return answer;
    }
    private static void comb(int r, int idx, int target)
    {
        if (r == 0)
        {
            int temp = 0;
            for (int i = 0; i < idx; i++)
            {
                temp += nums[countArr[i]];
            }
            if (checkPrime(temp) == 2)
                answer++;
        }
        else if (target == nums.length)
        {
            return ;
        }
        else
        {
            countArr[idx] = target;
            comb(r - 1, idx + 1, target + 1);
            comb(r, idx, target + 1);
        }
    }
    //소수판별
    private static int checkPrime(int num)
    {
        if (num == 1 || num == 0)
                return (1);
        for (int i = 2; i <= num / 2; i++)
        {
            if (num % 2 == 0)
                return 1; // 소수아님
        }
        return 2; //소수임
    }
}
