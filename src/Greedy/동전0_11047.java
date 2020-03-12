package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전0_11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n,k=0;
        int result=0;
        int[] costs;

        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());

        costs= new int[n];
        for(int i=0; i<n; i++) {
            costs[i] = Integer.parseInt(br.readLine());
        }

        for(int i=costs.length-1; i>=0; i--){
            result +=k/costs[i];
            k %=costs[i];
        }
        System.out.println(result);
    }

}
