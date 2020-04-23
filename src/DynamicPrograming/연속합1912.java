package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int max = 0;
        int[] dp = new int[100001];
        int[] arr = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //1)
        for(int i = 1; i <= n; i++){
            if(dp[i-1] + arr[i] > arr[i]){
                dp[i] = dp[i-1] + arr[i];
            }
            else
                dp[i] = arr[i];
        }
        max = dp[1];

        for(int i = 2; i <= n; i++){
            if(max < dp[i]){
                max = dp[i];
            }
        }
        System.out.println(max);

    }
}
/*
최대값을 구하기 위해서는 현재 자신의 값dp[i]을 선택하는 경우의 수가 두가지
1)
(현재값 + 이전값값)의 최대 vs  (이전값을 더하지 않은)현재값

 */
