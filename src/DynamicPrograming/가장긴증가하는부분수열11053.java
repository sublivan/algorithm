package DynamicPrograming;

import java.io.*;
import java.util.*;

public class 가장긴증가하는부분수열11053 {
    public static void main(String[]  args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] a= new int[n+1];
        int[] dp = new int[n+1];

        int max=0;

        st = new StringTokenizer(br.readLine());

        //1)
        for(int i=1; i<=n;i++){
            a[i] = Integer.parseInt(st.nextToken());
            int maxLen=0;
            for(int j=0;j<i;j++){
                if(a[i] > a[j]){
                    if(maxLen < dp[j]){
                        maxLen = dp[j];
                    }
                }
            }
            dp[i] = maxLen +1;
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}
/*
현재의 자신의 값을 과거의 값들과 비교하여 그 중 최대의 값으로 자신의 길이를 정하는 문제

1)
각 부분마다 과거의 저장한 배열을 검색하여야 한다
현재의 값이 배열에 이전 값들보다 큰 만큼 max 값을 증가시켜줘야한다
ex)
10 20 10 30
30이 현재면 max 3

 */