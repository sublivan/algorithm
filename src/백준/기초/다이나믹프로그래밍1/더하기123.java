package 백준.기초.다이나믹프로그래밍1;

import java.io.*;

public class 더하기123 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr =new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(br.readLine());
        int n;

        int[] dp =new int[11];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=0; i<t;i++){
          n=Integer.parseInt(br.readLine());

          for(int j=4; j<=n;j++){
              dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
          }
          wr.write(dp[n]+"\n");
        }


        wr.close();


    }
}
