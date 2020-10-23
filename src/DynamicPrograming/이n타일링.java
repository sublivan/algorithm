package DynamicPrograming;
//11726 2XN타일링
/*
BOTTOM UP 반복문
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이n타일링 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<=n; i++) {

            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);

    }
}
