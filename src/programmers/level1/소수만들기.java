package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {

    public static void main(String[] args) {
        System.out.println(new 소수만들기().solution(new int[]{1, 2, 3, 4}));

    }

    public int solution(int[] nums) {
        int primeCount = 0;

        for (int n1 = 0; n1 < nums.length - 2; n1++) {
            for (int n2 = n1 + 1; n2 < nums.length; n2++) {
                for (int n3 = n2 + 1; n3 < nums.length; n3++) {
                    int sum = nums[n1] + nums[n2] + nums[n3];
                    if (isPrime(sum)) {
                        primeCount++;
                    }
                }
            }
        }
        return primeCount;
    }

    /**
     * i < sum (시간복잡도 : O(N)
     * i <= sum / 2 (시간복잡도 : O(N)
     * i * i <= sum (시간복잡도 : O(루트 N)
     * 참고 : https://myjamong.tistory.com/139
     */
    private boolean isPrime(int sum) {
        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
