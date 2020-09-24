package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {

        StringBuilder sb = new StringBuilder(String.valueOf(n)).reverse();
        String[] nums = sb.toString().split("");

        int[] answer = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            answer[i] = Integer.parseInt(nums[i]);
        }
        return answer;
    }
}
