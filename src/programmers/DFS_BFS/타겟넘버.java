package programmers.DFS_BFS;

public class 타겟넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(new 타겟넘버().solution(numbers, target));
    }

    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer += dfs(numbers, 1, numbers[0], target);
        answer += dfs(numbers, 1, -numbers[0], target);
        return answer;
    }

    private int dfs(int[] numbers, int index, int preCalValue, int target) {
        if (index == numbers.length) {
            if (target == preCalValue)
                return 1;
            else
                return 0;
        }

        int plus = preCalValue + numbers[index];
        int minus = preCalValue - numbers[index];

        int count = 0;
        count += dfs(numbers, index + 1, plus, target);
        count += dfs(numbers, index + 1, minus, target);

        return count;
    }
}

/*
재귀함수를 통해서 모든경우의수(더하고, 빼고)로 다 넣어서 구한다.
최종값이 target 과 동일하면 1을 리턴, 리턴된 값을 누적한것이 결과값


n개의 음이 아닌 정수를 모두 사용하여 적절히 더하거나 빼서 타겟넘버를 만들어야한다.

매개변수
사용 할 수 잇는 숫자가 담긴 배열 numbers'

타겟 넘버 target


numbsers [1 1 1 1 1 1]

구현한 함수
dfs(int[] numbers, int index, int prev, int target)

매개변수
numbers : n개의 음이아닌 정수들
int index : numbers에서 정수하나씩 빼기위한 인덱스
int prev : (이전 수들의) 더하고 뺀 값을 저장한 변수
int target : 도달해야하는 숫자
---
탈출 조건
모든 정수를 사용했을때 :
 index가 numbers.length까지 도달했을때

모든 정수를 사용했다면 (더하고 뺀)결과가 target과 같은지 비교
만약 같다면 이 방법은 target을 만들 수 있는 경우의 수 이다 : return 1
같지 않다. 이 방법은 target을 만들 수 없는 경우의 수 이다. : return 0
---
덧셈과 뺄셈연산
이전 숫자와 현재숫자를 덧셈 했을때
이전 숫자와 현재숫자를 뺄셈 했을때
두가지 방법을 고려해야한다.

+1 + 1 +1
+1 - 1 + 1
+1 + 1 - 1
이렇게 여러가지 방법들을 고려해야한다.

각 덧셈과 뺄셈을 계산한 값과 다음 정수 index를 dfs에 넣어 보내준다.

각 방법마다 계속 재귀함수를 타고 들어가기때문에 count 라는 방법 가능유무가 리턴된 값을 더하며 저장한다.

최종적으로 count를 리턴하여 방법의 수를 누적한다.

---
주의
시작부터 + 연산만 하는 것이 아니다.
시작부터 - 연산부터 하는 경우가 있기 때문에 그 부분도 고려해야한다.
dfs(numbers, 1, -number[0], target)

-1 + 1 + 1 + 1 + 1 = 3





 */