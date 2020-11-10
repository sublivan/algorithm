package Greedy;

/*
첫째 줄에 사람의 수 N이 주어진다. N은 10보다 작거나 같은 자연수이다.
둘째 줄에는 키가 1인 사람부터 차례대로 자기보다 키가 큰 사람이 왼쪽에 몇 명이 있었는지 주어진다.
 i번째 수는 0보다 크거나 같고, N-i보다 작거나 같다
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 한줄로서기_1138 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //줄 선 사람의수
        int n= Integer.parseInt(br.readLine());
        //두번째줄 입력
        st=new StringTokenizer(br.readLine());
        //서있는 순서 결과를 담을 배열
        int[] result=new int[n];

        for(int i=1;i<=n;i++) {

            int x=Integer.parseInt(st.nextToken());
            //해당 사람의 위치를 찾게 해줄 변수
            int count=0;


            for (int j = 0; j< n; j++) {
                if (count == x && result[j] == 0) {
                    result[j] = i;
                    break;
                }
                if (result[j] == 0) count++;
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(result[i]+" ");
        }
    }
}
