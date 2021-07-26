package programmers.완전탐색;

import java.util.*;

//완전탐색_조합(combination))
public class 소수찾기lev2_combination {

    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }

    static int solution(String numbers) {
        List<String> nums = new ArrayList<>();
        List<Integer> outPut = new ArrayList<>();

        for (int i = 0; i < numbers.length(); i++) {
            nums.add(numbers.charAt(i) + "");
        }

        boolean[] visited = new boolean[nums.size()];

        for (int i = 0; i < nums.size(); i++)
        {
            visited[i] = true;
            combination(nums, outPut, visited, nums.size(), nums.get(i));
            visited[i] = false;
        }

        int prime_count = 0;
        for (Integer i : outPut)
        {
            if (isPrime(i))
            {
                prime_count++;
            }
        }
        return prime_count;
    }

    //백트래킹
    static void combination(List<String> nums, List<Integer> outPut, boolean[] visited, int r, String s) {
        if (r == -1)
            return;

        if (!outPut.contains(Integer.parseInt(s)))
            outPut.add(Integer.parseInt(s));

        for (int i = 0; i < nums.size(); i++)
        {
            if (!visited[i]) {
                visited[i] = true;
                combination(nums, outPut, visited,r - 1, s + nums.get(i));
                visited[i] = false;
            }
        }
    }

    //소수판별
    /*
    소수는 2부터시작, 1과 나자신만을 같는게 소수
    1은 소수가 아니다.
     */
    private static boolean isPrime(int num) {
        if (num == 1 || num == 0)
            return false;
        //어떤수의 약수는 제곱한 값이 어떤수 보다 작거나 같아야된다.
        for (int i = 2; i * i <= num; i++) {
            //나누어 떨어진다는것은 소수가 아니다.
            if (num % i == 0)
                return false;
        }
        return true;
    }
}


/*
https://selina-park.tistory.com/128
 */