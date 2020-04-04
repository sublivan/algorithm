package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 카드구매하기_11052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int[] pay = new int[n+1];
        int[] dp = new int[n+1];

        for(int i=0; i<str.length;i++){
            pay[i+1] = Integer.parseInt(str[i]);
        }
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i],dp[i-j]+pay[j]);
            }
        }
        System.out.println(dp[n]);


    }
}




