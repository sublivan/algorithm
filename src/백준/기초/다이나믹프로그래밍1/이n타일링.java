package 백준.기초.다이나믹프로그래밍1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이n타일링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1]=1;
        dp[2]=2;

       for(int i=3; i<=n; i++){

           dp[i] =(dp[i-1]+dp[i-2])%10007;

       }

        System.out.println(dp[n]);

    }
}
