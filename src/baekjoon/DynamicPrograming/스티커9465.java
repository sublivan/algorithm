package DynamicPrograming;

import java.io.*;
import java.util.StringTokenizer;

public class 스티커9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t= Integer.parseInt(br.readLine());

        int dp[][] =new int[2][100001];
        int 스티커[][] =new int[2][100001];
        StringTokenizer st;
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            for(int i=0;i<2;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=1;j<=n;j++){
                    스티커[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //1)
            dp[0][0]=dp[1][0]=0;
            dp[0][1] = 스티커[0][1];
            dp[1][1] = 스티커[1][1];

            //2)
            for(int i=2; i<=n;i++){
                dp[0][i] = Math.max(dp[1][i-1],dp[1][i-2]) + 스티커[0][i];
                dp[1][i] = Math.max(dp[0][i-1],dp[0][i-2]) + 스티커[1][i];
            }

            int result = Math.max(dp[0][n],dp[1][n]);

            System.out.println(result);


        }
    }
}
/*
1)
3칸 뒤 대각선의 경우는 결국 1칸뒤 대각선 + 2칸뒤 대각선 +로 3칸뒤 대각선의 경우도 갈 수 있기 때문에
절대로 많은 칸수를 거친 경우보다 클 수 없다.(비슷한 케이스로 50 -> 20으로 가는 경우도 동일하다.)

따라서 우리가 고려해야 할 것은 1칸 뒤 대각선, 2칸 뒤 대각선의 경우로 이렇게 2가지 이다.
첫번째 주어진 50, 30은 시작점이기 때문에 반드시 고정되야 하는 값

두번째 칸을 계산하기 위해선 첫번째칸에서 오는경우말고 첫번째-1칸인 0 번째 에서 오는 경우도 있다
그래서  0번째 칸의 값들을 0으로 미리 지정해줘야된다


2)
1칸뒤 대각전 vs 두칸뒤 대각선으로 가는경우 해서 나오 큰값과 스티커 점수를 더해준다


 */