package DynamicPrograming;

import java.util.Scanner;

public class 포도주시식2156 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int input;

        int dp[] =new int[10001];
        int wine[] =new int[10001];

        for(int i = 1;i <= n; i++){
            input= sc.nextInt();
            wine[i] = input;
        }

        //1)
        for(int i = 1; i < 3 && i <= n; i++){
            if(i == 1){
                dp[i] = wine[i];
            }
            else
                dp[i] = wine[i] + wine[i-1];
        }
        System.out.print(dp[1] + " ");
        System.out.print(dp[2] + " ");
        int result=0;
        //2)
        for(int i = 3;i <= n; i++){
            result = Math.max(dp[i-2] + wine[i], dp[i-1]);
            result = Math.max(result, wine[i] + wine[i-1] + dp[i-3]);
            dp[i] = result;
            System.out.print(dp[i] + " ");
        }
        System.out.println(dp[n]);
    }
}

/*
1)
이전 세번째 위치 확인을 위해 -1 위치값이 나오지 않기위해 1부터 시작

포도주 세개를 연속으로 먹을 수 없다는것을 고려해야한다
즉 현재 먹는 포도주의 합이 최대일 경우를 생각해보면

2)
 1. 내가 현재 포도주를 먹지 않았을경우
    = dp[i-1]
 2. 현재의 포도주를 마시고 이전 거를 안마신 경우
    = wine[i] + dp[i-2]
 3. 현재의 포도주와 이전 포도주를 마신경우
    = wine[i] + wine[i-1] + dp[i-3]
 */
