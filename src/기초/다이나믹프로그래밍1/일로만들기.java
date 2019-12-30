package 기초.다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 일로만들기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int[] dp= new int[input+1];

        dp[0]=dp[1]=0;

        for(int i=2;i<=input;++i){
          dp[i] = dp[i-1]+1;

          if(i%3 == 0){
              dp[i] = Math.min(dp[i],dp[i/3]+1);

          }
          if(i%2 == 0){
              dp[i] =Math.min(dp[i],dp[i/2]+1);

          }
        }

        System.out.println(dp[input]);


    }
}
