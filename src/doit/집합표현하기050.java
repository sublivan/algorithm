package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [유니온 파인드]
 * boj 1717
 *
 * {0}, [1}, {2}, ...{n}이 각각 n + 1개의 집합을 이루고 있다.
 * 여기에 합집합 연산과 두 원소가 같은 집합에 포함돼 있는지를 확인하는 연산을 수행하라
 * 
 * 입력
 * - 원소개수 n, 질의 개수 m
 * - 질의
 *  - 0 a b(합집합) :  각각 a와 b의 포함돼 있는 집합을 합친다. 
 *  - 1 a b(확인)) : a와 b가 같은 집합에 포함돼 있는지 확인
 *
 *  주의
 *  - a와 b는 n이하의 자연수 또는 0 또는 같을 수 있다.
 */
public class 집합표현하기050 {
    public static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        System.out.println(Arrays.toString(parent));

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (op == 0) { // 유니온
                union(a, b);
            } else { // 파인드
                if(checkSame(a, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }


    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            parent[b] = a;
        }
    }

    public static int find(int a) {
        if (a == parent[a]) {
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }

    public static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);

        if (a == b) {
            return true;
        }
        return false;
    }
}
