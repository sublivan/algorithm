package DynamicPrograming;

//14852 타일채우기3
import java.io.*;

public class FullTiling3_14852 {

    static long[][] d=new long[1000001][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(dp(n));


    }

    static long dp(int x){
        d[0][0] = 0;
        d[1][0] = 2;
        d[2][0] = 7;
        d[2][1] = 1;
        for(int i=3;i<=x ;i++){
            d[i][1] = (d[i-1][1] + d[i-3][0])%1000000007;
            d[i][0] = (3*d[i-2][0]+2*d[i-1][0]+2*d[i][1])%1000000007;
        }

        return d[x][0];
    }

}
