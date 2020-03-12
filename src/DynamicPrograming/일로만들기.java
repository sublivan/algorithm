package DynamicPrograming;
/*
Top-Down: 재귀버전

정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 일로만들기 {
    static int[] dp;
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        dp= new int[input+1];
        System.out.println(calculate(input));

    }
    static int calculate(int num){
        if(num <2)
            return 0;
        if(dp[num] >0)
            return dp[num];

        dp[num] =calculate(num-1)+1;

        if(num%2 ==0){
            dp[num] = Math.min(dp[num], calculate(num/2)+1);
        }
        if(num%3 ==0){
            dp[num] = Math.min(dp[num], calculate(num/3)+1);
        }
        return dp[num];
    }
}
