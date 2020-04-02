package DynamicPrograming;
//11727 2xn타일링2
/*
BOTTOM UP
2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */

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
