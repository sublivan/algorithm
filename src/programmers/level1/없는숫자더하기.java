package programmers.level1;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int max = 9 * (9 + 1) / 2; //등차수열의 합

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return max - sum;
    }
}
