package Greedy;

/*
다른 모든 지원자와 비교했을 때 서류심사 성적과 면접시험 성적 중 적어도 하나가 다른 지원자보다
떨어지지 않는 자만 선발
즉, 어떤 지원자 A의 성적이 다른 어떤 지원자 B의 성적에 비해
서류 심사 결과와 면접 성적이 모두 떨어진다면 A는 결코 선발되지 않는다.
이러한 조건을 만족시키면서, 선발할 수 있는 신입사원의 최대 인원수를 구하라
 */
import java.io.*;
import java.util.StringTokenizer;

public class 신입사원_1946 {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수

        while(t-- >0){
            int  n =Integer.parseInt(br.readLine()); //지원자 숫자
            int[] a =new int[n+1];
            for(int i=0;i<n;i++) {
                StringTokenizer st =new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); //서류심사 성적
                int y = Integer.parseInt(st.nextToken()); //면접심사 성적

                a[x] =y;
            }
            int result =1; //첫번째는 무조껀 합격이니까 1명 무조건 카운트
            int standard= a[1]; //첫번째의 결과를 기준으로 시작
            for(int x=2; x<=n; x++) {
                if(standard > a[x]){
                    result++;
                    standard= a[x];
                }
            }
            System.out.println(result);

        }

    }
}
