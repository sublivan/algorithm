package 백준.기초.다이나믹프로그래밍1;

import java.io.*;

public class 이n타일링2 {


    public static void main(String[]args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1]=1;
        dp[2]=3;

        for(int i=3;i<=n;++i){

            dp[i]=(dp[i-1]+dp[i-2]*2)%10007;
        }

        wr.write(dp[n]+"");
        wr.close();


    }
}
