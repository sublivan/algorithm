package DynamicPrograming;

/*
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 */
import java.io.*;

public class 더하기123 {

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr =new BufferedWriter(new OutputStreamWriter(System.out));


        int t = Integer.parseInt(br.readLine());
        int n;

        int[] dp =new int[11];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

        for(int i=0; i<t;i++){
          n=Integer.parseInt(br.readLine());

          for(int j=4; j<=n;j++){
              dp[j]=dp[j-1]+dp[j-2]+dp[j-3];
          }
          wr.write(dp[n]+"\n");
        }


        wr.close();


    }
}
