package DynamicPrograming;

import java.util.Scanner;

public class 합분해2225 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //1)
        int N = sc.nextInt();
        int K = sc.nextInt();

        //do[k][n]
        long dp[][] = new long[201][201];

        //2)
        for(int i=0; i <= N; i++){
            dp[1][N] = 1;
        }

        for(int i=0; i <= N; i++){
            dp[2][i] = i+1;
        }

        //3)
        for(int i =3; i <= K; i++){
            for(int j = 0; j <= N; j++){
                for(int k = 0; k <= j; k++){
                   dp[i][j] = (dp[i][j] + dp[i-1][j-k]) % 1000000000;
                }
            }
        }

        long result = dp[K][N] % 1000000000;
        System.out.println(result);
    }
}

/*
1)
 0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수

2)
 정수 1개를 이용하여 n의 수를 만드는경우는 n 마다 1개
 정수 2개를 이용하여 n의 수를 만드는경우는 n 마다 n+1개

3)
합 N을 만들기 위해서는 0~N까지 정수가 다양하게 존재한다.
그 중 마지막 수를 L라고 가정하자.
L 이전의 수들의 합은 N-L 이라는 것을 알 수 있다.
또한 K개에서 L인 수를 제외하기 때문에 수의 개수는 K-1이 된다.
DP[K][N] = Σ(DP[K-1][N-L])
L => 0 <= L <= N

 그 상태의 값을 구하기위해서 그 전의 값들을 전부다 구해서 더하는 식으로 구할 수 있다.
예를 들어,
20을 3번의 합으로 구하는 경우의 수는 0~20을 두번의 합으로 만들 수 있는 경우의 수를 전부 더하면 되는 것이다.

]

 */