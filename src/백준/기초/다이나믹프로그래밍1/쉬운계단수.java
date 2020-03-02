package 백준.기초.다이나믹프로그래밍1;

import java.io.*;

public class 쉬운계단수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        long[][] dp = new long[101][11];

        int n =Integer.parseInt(br.readLine());

        for(int i=1; i<=9;i++){
            dp[1][i]= 1;
        }

        for(int i=2; i <= n;i++){
            dp[i][0]=dp[i-1][1]; //L=0
            for(int j=1; j <= 9; j++){
                dp[i][j]= (dp[i-1][j-1]+dp[i-1][j+1])%10007;
            }

        }
        long sum=0;
        for(int i=0; i<10;i++){
            sum +=dp[n][i];
        }
        wr.write(sum%10007+"");
        wr.close();
    }
}
