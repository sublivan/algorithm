package 안경잡이개발자.DynamicPrograming;

//11727 2xn타일링2
import java.io.*;

public class Tiling2N2_11727 {
    static int[] d=new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        System.out.println(dp(n));
    }

    static int dp(int  x) {
        // n이 1일때 1가지 n이 2일때 3가지
        if(x==1) return 1;
        if(x==2) return 3;
        if (d[x] != 0) return d[x];
        return d[x] = (dp(x-1)+ 2*dp(x-2))%10007;
    }
}
