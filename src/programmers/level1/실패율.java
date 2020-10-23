package programmers.level1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(n, stages)));
    }
    public static int[] solution(int N, int[] stages) {
        //N 스테이지개수 , stages 사용자별 도달한 스테이지
        int[] cnt = new int[N + 1];
        Fail[] fails = new Fail[N + 1];
        //0번스테이지 없으니 초기화
        fails[0] = new Fail(Integer.MAX_VALUE, -1);

        for(int v : stages)
        {
            if(v != N + 1)
                cnt[v]++;
        }
        //스테이지 참가한 사람수
        int total = stages.length;
        for(int i = 1; i <= N; i++)
        {
            //스테이지에 도달한 유저 없으면 0
            if(total == 0)
                fails[i] = new Fail(i, 0);
            else
                fails[i] = new Fail(i, (double)cnt[i] / total);
            total -= cnt[i];
        }

        //실패율 기준 내림차순 정렬
        Arrays.sort(fails, new Comparator<Fail>(){
            @Override
            public int compare(Fail o1, Fail o2) {
                if(o1.rate < o2.rate)
                    return 1;
                else if(o1.rate > o2.rate)
                    return -1;
                else
                    return 0;
            }
        });

        int[] answer = new int[N];
        int index = 0;
        for(Fail f : fails)
        {
            if(index == N)
                break;
            answer[index++] = f.n;
        }
        return answer;
    }

    static class Fail{
        //스테이지번호
        int n;
        //스테이지별 실패율
        //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        double rate;
        Fail(int n, double rate)
        {
            this.n = n;
            this.rate = rate;
        }
//         @Override
//         public String toString() {
//             return "Fail{" +
//                     "n=" + n +
//                     ", rate=" + rate +
//                     '}';
//         }
    }
}
