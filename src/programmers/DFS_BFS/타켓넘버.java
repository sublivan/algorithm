package programmers.DFS_BFS;

public class 타켓넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        answer += dfs(numbers, 1, numbers[0], target);
        answer += dfs(numbers, 1, -numbers[0], target);
        return answer;
    }

    private static int dfs(int[] numbers, int index, int prev, int target) {
        if (index == numbers.length) {
            if (target == prev)
                return 1;
            else
                return 0;
        }
        int cal1 = prev + numbers[index];
        int cal2 = prev - numbers[index];
        int ans = 0;
        ans += dfs(numbers, index + 1, cal1, target);
        ans += dfs(numbers, index + 1, cal2, target);

        return ans;
    }
}

/*
재귀함수를 통해서 모든경우의수(더하고, 빼고)로 다 넣어서 구한다.
최종값이 target 과 동일하면 1을 리턴,  값을 누적한것이 결과값

 */