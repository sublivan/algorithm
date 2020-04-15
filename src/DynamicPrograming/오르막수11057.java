package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 오르막수11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        int dp[][]=new int[10001][10];

        //1)
        for(int i=0; i<10;i++){
            dp[1][i] = 1;
        }
        //2)
        for(int i=2; i<=n;i++){
            for(int j=0;j<10 ;j++){
                for(int k=j ; k<10;k++){
                    dp[i][k] +=dp[i-1][j];
                    dp[i][k] %=10007;
                }
            }
        }

        int sum=0;
        for(int i=0;i<10;i++){
            sum += dp[n][i];
        }
        System.out.println(sum);
    }
}

/*
1)길이가 1인 오르막개수는 1개
 */

/*
2)
마지막 자리가 0이면 0 1 2 3 4 5 6 7 8 9  dp[n][0~9] += dp[n][0]
마지막자리가 1이면 1 2 3 4 5 6 7 8 9  dp[n][1~9] += dp[n][1]
.
.
마지막자리가 9이면 9 dp[n][9] += dp[n-1][9]
 */