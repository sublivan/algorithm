package programmers.스택_큐;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
//        System.out.println(Arrays.toString(solution2(progresses, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] days = new int[progresses.length];

        for(int i = 0; i < progresses.length; i++)
        {
           if((100 - progresses[i]) % speeds[i] == 0)
           {
               days[i] = (100 - progresses[i]) / speeds[i];
           }
           else
               days[i] = (100 - progresses[i]) / speeds[i] + 1;

            System.out.println(i + "progress : " + days[i]);
        }
        ArrayList<Integer> result = new ArrayList<>();

        int cnt;
        int j = 0;
        for(int i = 0; i < days.length; i++)
        {
            cnt = 0;
            for(j = i + 1; j < days.length; j++)
            {
                if(days[i] < days[j])
                {
                    i = j - 1;
                    System.out.println(i);
                    break;
                }
                cnt++;
            }
            result.add(cnt + 1);
            if(j == days.length) break;
        }
        answer = new int[result.size()];
        for(int i = 0 ; i < result.size(); i++)
        {
            answer[i] = result.get(i);
        }
        return answer;
    }

//queue를 활용하여 구현
//    public static int[] solution2(int[] progresses, int[] speeds) {
//        int[] answer= {};
//        Queue<Integer> que = new LinkedList<>();
//        for(int i = 0; i < progresses.length; i++)
//        {
//            int day = (100 - progresses[i]) % speeds[i] == 0 ?
//                    (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
//            que.add(day);
//        }
//
//        System.out.println(Arrays.toString(que.toArray()));
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int cnt = 1;
//        int prev = que.poll();
//        while(!que.isEmpty())
//        {
//            int current = que.poll();
//            System.out.println("prev : " + prev + " curr : " + current );
                //첫번째 기능 개발 기간이 다음 개발 기간보다 크거나 같다면
                //첫번째 기능을 배포할때 다음 기능도 같이 배포해야된다
//            if(prev >= current)
//                cnt++;
//            else // 그렇지 않다면 이전 기능만 배포된다
//            {
//                System.out.println("cnt : " + cnt);
//                prev = current;
//                list.add(cnt);
//                cnt = 1;
//            }
//        }
//        list.add(cnt);
//
//        answer = new int[list.size()];
//        for(int i = 0 ; i < list.size(); i++)
//        {
//            answer[i] = list.get(i);
//        }
//
//        return answer;
//    }
}
