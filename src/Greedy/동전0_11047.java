package Greedy;
/*
동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
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
