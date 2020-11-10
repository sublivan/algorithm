package programmers.스택_큐;

import java.util.*;

public class 프린트 {
    public static void main(String[] args)
    {
        int[] priorities ={1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> wait = new LinkedList<>();

        for(int prior : priorities)
        {
            wait.add(prior);
        }
        Arrays.sort(priorities);
        int length = priorities.length - 1;
        while(!wait.isEmpty())
        {
            int current = wait.poll();
            //queue의 현재 수가 가장 큰수 이면
            if(current == priorities[length - answer])
            {
                answer++;
                location--;
                if(location < 0)
                    break;
            }
            else //현재 수 보다 큰 수가 대기목록에 있는 경우
            {
                wait.add(current);
                location--;
                if(location < 0)
                    location = wait.size() - 1;
            }
        }
        return answer;
    }
}

/*
location이 0 보다 작다는 소리는 큐의 맨 앞까지 우선순위를 검증한 상태

if 문의 location-- 경우에는 우선순위와 같은 상태이므로 반복을 종료시키면 되지만,

else 문의 location-- 경우에는 우선순위에서 밀려 제일 뒤로 순위가 밀린 상태이므로
제일 마지막 인덱스를 가리키도록 재할당해준다.

배열을 오름차순으로 정렬해놓았으므로, 가장 높은 우선순위를 비교했다면,
더이상 그 수를 바라 볼 필요가 없다.
그 다음으로 큰 우선순위를 바라볼 수 있도록 length - answer 를 수행한다.
 */