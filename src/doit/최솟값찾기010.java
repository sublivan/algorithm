package doit;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * [슬라이딩 윈도우]
 * boj 11003
 *
 * N개의 수와 L이 주어진다.
 * Ai-L+1 ~ Ai중 최솟값을 Di라고 할 때 D에 저장된 수를 출력하라.
 * (i <= 0 인 Ai는 무시하라)
 *
 * 입력
 * - 숫자의 개수 N, 슬라이딩 윈도우 크기 L
 * - N개의 숫자
 */
public class 최솟값찾기010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Deque<Node> nodeDeque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!nodeDeque.isEmpty() && nodeDeque.getLast().value > now ) { // 덱의 마지막 노드 값이 현재값(now) 보다 클면 삭제
                nodeDeque.removeLast();
            }
            nodeDeque.addLast(new Node(i, now));

            if (nodeDeque.getFirst().index <= i - L) { // 범위에서 벗어난 값은 덱에서 제거
                nodeDeque.removeFirst();
            }

            bw.append(nodeDeque.getFirst().value + " ");

            bw.flush();
            bw.close();
        }
    }

    static class Node {
        int index;
        int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
