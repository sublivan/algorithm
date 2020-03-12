package DynamicPrograming;

import java.io.*;

//피보나치 수열
//D[N]=D[N-1]+D[N-2]
//시간복잡도 o(N)
public class Fibonacci {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        dp=new int[n+1];

        System.out.println(fibonacci(n));
    }
    public static int fibonacci(int x) {
        if (dp[x] != 0) return dp[x];
        if (x <= 2) return dp[x]=x;
        return dp[x] = fibonacci(x - 1) + fibonacci(x - 2);
    }


}