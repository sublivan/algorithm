package DynamicPrograming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴바이토닉부분수열11054 {
    public static void main(String[] args) throws IOException {

        int[][] dp = new int[2][1001];
        int max=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr= new int[n+1];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //1)
        for(int i = 1; i <= n; i++){
            int maxA =0;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    if(maxA < dp[0][j]){
                        maxA = dp[0][j];
                    }
                }
            }
            dp[0][i] = maxA + 1;
        }
        //2)
        for(int i = n; i >= 1; i--){
            int maxA =0;
            for(int j = n; j > i; j--){
                if(arr[i] > arr[j]){
                    if(maxA < dp[1][j]){
                        maxA = dp[1][j];
                    }
                }
            }
            if(dp[1][i] < maxA + 1){
                dp[1][i] = maxA + 1;
            }
        }
        //3)
        for(int i = 1; i <= n ; i++){
            if(max < dp[0][i] + dp[1][i]){
                max = dp[0][i] + dp[1][i];
            }
        }
        System.out.println(max -1);


    }
}

/*
1 5 2 1 4 3 4 5 2 1
가장 긴 증가하는 부분수열 두번 사용하면 된다
1)
오른쪽 방향으로 가장 긴 증가하는 부분 수열 계산,  dp[0][i] 저장

2)
왼쪽 방향으로 가장 긴 증가하는 부분 수열 계산,  dp[1][i] 저장

3)
두개의 dp 배열의 합이 최대가 되는 곳이 가장 긴 바이토닉 수열이 되는것

4)
둘다 자기 자신을 포함하기때문에 max -1 해주어야한다

 */
