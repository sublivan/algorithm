package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장큰증가부분수열11055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] num = new int[n+1];
        int[] dp = new int[n+1];

        st= new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int result=0;

        //1)
        for(int i=1; i <=n ; i++){
            int max=0;
            for(int j=0; j<i; j++){
                if(num[i] > num[j]){
                    if(max < dp[j]){
                        max = dp[j];
                    }
                }
            }
            dp[i] =max + num[i];
            if(result < dp[i]){
                result = dp[i];
            }
        }
        System.out.println(result);
    }
}

/*
1)
현재의 자신의 값을 과거의 값들과 비교하여 현재 자신의 값과 합을 했을 때 최고값을 찾아낸다

1)
각 부분마다 과거의 저장한 배열을 검색하여야 한다
현재의 값이 배열에 이전 값과 더했을때 최대값을 max에 저장
result는 여태까지 결과중에 가장큰 값을 가진다
ex)
1  100 2 50 60일때
dp
0 1 101 3 53 113
 */
