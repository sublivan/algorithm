package DynamicPrograming;

import java.io.*;
import java.util.*;

public class 가장긴감소하는부분수열11722 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int result =0;

        int[] dp = new int[n+1];
        int[] arr= new int[n+1];


        st = new StringTokenizer(br.readLine());
        //1)
        for(int i=1; i<=n; i++){
            int min =0;
            arr[i] = Integer.parseInt(st.nextToken());
            for(int j=0; j<i; j++){
                if(arr[i] < arr[j]){
                    if(min < dp[j])
                        min = dp[j];
                }
            }
            dp[i] = min + 1;
            if(result < dp[i])
                result = dp[i];
        }

        System.out.println(result);
    }
}

/*
1)
가장긴증가하는부분수열과 달리,
현재값(i)보다 그 앞에 있느 값(j)이 더 높은 조건을 찾으면된다
10 30 10 20 20 10
30 20 10
 */
