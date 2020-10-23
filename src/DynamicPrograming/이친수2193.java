package DynamicPrograming;

import java.util.Scanner;

public class 이친수2193 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        //1)
        long dp[]=new long[91];
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;

        for(int i=4;i<=n;i++){
            dp[i] = dp[i-1] +dp[i-2];
        }
        System.out.println(dp[n]);

    }
}

//1) 47번째 부터 int 범위 초과
