package 백준.기초.다이나믹프로그래밍1;


import java.io.*;

public class 카드구매하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr =new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        String[] temp=br.readLine().split(" ");

        int[] pn = new int[n+1];

        int[] dp= new int[n+1];

        for(int i=1;i<=n;++i){
            pn[i]= Integer.parseInt(temp[i-1]);
        }

        for(int i=1 ; i<=n ; i++) {
            for (int j = 1; j <=i; j++) {

                dp[i] = Math.max(dp[i], dp[i-j]+pn[j]);
            }
        }


        wr.write(dp[n]+"");
        wr.close();
    }
}
