package programmers;

import java.util.Arrays;

public class 거스름돈 {
    public static void main(String[] args) {
        int[] money = {3, 4, 5};
        System.out.println(solution(10, money));
    }
    public static int solution(int n, int[] money) {
        int answer = 0;
        int[] cnt = new int[100001];
        cnt[0] = 1;
        for(int i = 0; i < money.length; i++)
        {
            //돈의 최소는 1원이니까 1부터
            for(int m = 1; m <= n; m++)
            {
                if(m >= money[i])
                    cnt[m] += cnt[m - money[i]];
            }
        }
        answer = cnt[n] % 1000000007;
        //System.out.println(Arrays.toString(cnt));
        return answer;
    }
}
