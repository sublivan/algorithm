package programmers.level1;

import java.util.*;

public class 소수찾기 {
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean isPrime;
        for(int i = 2; i <= n; i++)
        {
            isPrime = true;
            for(int j = 2 ; j * j<= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                answer++;
        }
        return answer;
    }

//    public static int solution2(int n) {
//        int answer = 0;
//        boolean[] prime = new boolean[n + 1];
//        Arrays.fill(prime, true);
//        prime[0] = false;
//        prime[1] = false;
//        for(int i = 2; i <= n; i++)
//        {
//            for(int j = 2 ; j * j <= i; j++) {
//                if (i % j == 0) {
//                    prime[i] = false;
//                    break;
//                }
//            }
//        }
//        for(boolean check : prime)
//            if(check == true)
//                answer++;
//        return answer;
//    }
}
/*
어떤수의 약수는 약수를 제곱했을때 어떤수보다 클 수 없다.

약수는 자기자신 / 2 보다 클수 없다
 */