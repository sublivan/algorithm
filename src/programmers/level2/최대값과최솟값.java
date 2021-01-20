package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

public class 최대값과최솟값 {
    public String solution(String s) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (String num : s.split(" ")) {
            nums.add(Integer.parseInt(num));
        }

        Collections.sort(nums);

        int min = nums.get(0);
        int max = nums.get(nums.size() - 1);

        String answer = min + " " + max;
        return answer;
    }
}
