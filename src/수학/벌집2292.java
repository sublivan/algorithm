package 수학;

import java.util.*;

public class 벌집2292 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    private static int solution(int n)
    {
        if(n == 1)
            return 1;
        int num = 2;
        int cnt = 1;
        while (num <= n) {
            num += 6 * cnt;
            cnt++;
        }
        return cnt;
    }
}
/*
//a(n) = a(n-1) + (n-1) * 6
1은 1
2부터 규칙이 적용된다.
 */