package DynamicPrograming;

//2133 타일채우기
/*
3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
 */
import java.io.*;
public class FullTiling_2133 {
    static int[] d=new int[31];

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(dp(n));
    }

    static int dp(int x){
        if(x == 0) return 1;
        //높이가 3이기 때문에 1일때 가능한 경우 없음
        if(x == 1) return 0;
        if(x == 2) return 3;
        if(d[x] != 0) return d[x];
        int result = 3 * dp(x-2);
        //짝수 일때, 새로운 방법 2개씩 생성됨
        for(int i=3 ; i<=x ; i++){
            if(i%2 ==0)
                result += 2*dp(x-i);
        }
        return d[x] = result;
    }
}
