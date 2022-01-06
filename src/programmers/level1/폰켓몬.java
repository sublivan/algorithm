package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 2, 3};
        System.out.println("new 폰켓몬().solution(nums) = " + new 폰켓몬().solution(nums));
    }

    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int kindsSize = map.keySet().size();
        int maxTakePonketmonSize = nums.length /2;

        if (maxTakePonketmonSize  > kindsSize) {
            answer = kindsSize;
        } else {
            answer = maxTakePonketmonSize;
        }
        return answer;
    }
}
