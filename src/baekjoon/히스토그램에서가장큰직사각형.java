package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/6549
//https://blog.naver.com/occidere/221057769152

public class 히스토그램에서가장큰직사각형 {
    int[] segmentTree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            }
        }
    }
}
/*
각각의 막대를 높이로 하면서 만들수 잇는 가장큰 직사각형을 만들어야한다.

모든 막대 x에 대해서, x를 높이로하면서, 만들 수 있는 가장 큰 직사각형을 찾아야한다.

x를 높이로 하면서 만들 수 있는 가장 큰 직사각형은

x의 왼쪽에 잇는 막대 중에 x보다 높이가 작은 첫 번째 막대 left와

x의 오른쪽에 있는 막대 중에서 x보다 높이가 작은 첫 번째 막대 right를 찾아야한다.


o(n^2) -> n
     <- n

좋지않은 방법

-------

스택에 막대를 넣기 전에

스택의 가장 위에 잇는 막대 top과 현재 넣으려는 막대 x를 비교해야한다.

top의 높이로 하는 직사각형은 x를 지나갈수 없다.

top을 높이로하는 직사각형의 right는 x-1이다.

top을 높이로 하는 직사각형의 left는 top다음에 스택에 들어있는 막대

left와 right를 구했기 때문에, top을 높이로 하는 넓이를 구할 수 있다.
 */
