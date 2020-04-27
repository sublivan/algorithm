package DynamicPrograming;

import java.util.Scanner;

public class 제곱수의합1699 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];


        for(int i =1; i <=n ; i++){

            //1)
            dp[i] = i;
            //2)
            for(int j=1; j*j <= i ;j++){
                dp[i] = Math.min( dp[i], dp[i- j*j]+1);

            }
        }
        System.out.println(dp[n]);
    }
}
/*
1)
dp[i] 는 i의 제곱수의 합으로 나타내는 경우라 할때,
1로만 더해서 i 값을 만든다면 경우의 수는 i 가 될것이다

2)
1부터 시작해서 어떤 수를  제곱했을때 i 에 가장 가까운 수를 n 이라 했을때
dp[i] = min( dp[i], dp[i - j*j] + 1) 로 나타낼수 있다 (최소 제곱수의 항을 찾기위해 min)

ex)
dp[5]의 경우,
dp[5] = dp[5-1*1]+1 (dp[4] 인 경우에 1을 제곱한 값을 더한 경우)
dp[5] = dp[5-2*2]+1 (dp[1] 인 경우에 2를 제곱한 값을 더한 경우)

 */
