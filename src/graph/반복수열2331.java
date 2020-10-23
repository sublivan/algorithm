package graph;

import java.util.*;

public class 반복수열2331 {
    //A의 최대9999, P의 최대5
    //9*9*9*9*9*5 = 295,245
    final static int MAX = 300000;
    static int A,P;
    static int[] visited = new int[MAX];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        P = sc.nextInt();

        dfs(A);
        int result =0;

        for(int i=0; i < MAX; i++){
            if(visited[i] == 1){
                result++;
            }
        }
        System.out.println(result);


    }
    static void dfs(int a) {
        //반복구간이 한번 반복되었다는 것을 의미
        visited[a]++;

        if (visited[a] == 3) {
            return;
        }
        int sum = 0;
        while (a > 0) {
            //각 자리의 숫자*P + 각 자리의 숫자*P
            sum += (int) Math.pow((a % 10), P);
            a /= 10;
        }
        dfs(sum);
    }
}
/*

1. A=9999이고 P=5일 때 연산 결과가 최대가 되는데
이 때 값이 30만보다 작으므로 visited 배열 크기를 30만으로 잡았습니다.

2. A부터 DFS를 시작하는데 해당 숫자가 방문될 때마다
visited 배열의 해당 인덱스를 1 증가시킵니다.

3. visited 배열의 해당 인덱스 값이 3이 된다면
반복 수열이 두번째 반복하는 시점이므로 재귀 함수를 탈출합니다.

4. 이후 visited 배열을 전부 방문하면서
한번만 등장한 숫자들의 갯수를 파악하고 결과를 출력합니다.
 */