package DynamicPrograming;

//11726 2XN타일링
/*
TOP-DOWN
2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 */
import java.io.*;
public class Tiling2N_11726 {
    static int[] d=new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));

    }

    static int dp(int x){
        // n이 1일때 1가지 n이 2일때 2가지
        if(x<=2) return d[x]=x;
        if(d[x] !=0) return d[x];
        return d[x] =(dp(x-1)+dp(x-2))%10007;
    }
}
