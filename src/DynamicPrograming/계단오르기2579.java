package DynamicPrograming;

import java.util.Scanner;

public class 계단오르기2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] stair = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n; i++){
            stair[i] = sc.nextInt();
        }

        for(int i=1; i <= 3 && i <= n; i++){
            if(i !=3){
                dp[i] = dp[i-1] + stair[i];
            }
            else{
                dp[i] = Math.max(stair[i] + dp[i-2], stair[i] + stair[i-1]);
            }
        }
        //중요)
//        dp[0]= stair[0];
//        dp[1] = Math.max(stair[0]+stair[1], stair[1]);
//        dp[2] = Math.max(stair[0]+stair[2], stair[1]+stair[2]);

        for(int i=4; i <= n; i++){
            dp[i] =  Math.max(dp[i-2] + stair[i], dp[i-3] + stair[i-1] + stair[i]);
        }
        System.out.println(dp[n]);

    }
}
/*
1)
  첫번째로 현재 계단 전의 계단을 밟지 않는 경우와
  현재 계단 전의 계단을 밟은 경우 이렇게 두가지로 나눌 수 있다

  dp[i] = max( stair[i] + dp[i-2], stair[i] + stair[i-1] + dp[i-3] )

 중요)
 처음에 초기화 하는 방식으로 했지만 초기화한 값이
 dp의 크기에 해당 않을때 런타임에러가 발생하였다
 */
