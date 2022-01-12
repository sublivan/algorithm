package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 킹1063 {

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String kingPos = st.nextToken();
        String dolPos = st.nextToken();

        Position king = new Position(Math.abs(8 - (kingPos.charAt(1) - '0')), kingPos.charAt(0) - 'A');
        Position dol = new Position(Math.abs(8 - (dolPos.charAt(1) - '0')), dolPos.charAt(0) - 'A');

        int moveCnt = Integer.parseInt(st.nextToken());

        Map<String, int[]> moveRule = makeMoveRule();

        while (moveCnt-- > 0) {
            String move = br.readLine();

            int mx = moveRule.get(move)[0];
            int my = moveRule.get(move)[1];

            int nx = king.x + mx;
            int ny = king.y + my;

            if (nx < 0 || ny < 0 || nx > 7 || ny > 7) {
                continue;
            } else if (dol.x == nx && dol.y == ny) {
                if (dol.x + mx < 0 || dol.y + my < 0 || dol.x + mx > 7 || dol.y + my > 7) {
                    continue;
                } else {
                    king.x += mx;
                    king.y += my;

                    dol.x += mx;
                    dol.y += my;
                }
            } else {
                king.x += mx;
                king.y += my;
            }
        }

        System.out.printf("%c%d\n", king.y + 'A', Math.abs(8 - king.x));
        System.out.printf("%c%d", dol.y + 'A', Math.abs(8 - dol.x));

    }


    private static Map<String, int[]> makeMoveRule () {
        String[] s = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
        int[][] xy = {{0, 1},{0, -1},{1, 0},{-1, 0},{-1, 1},{-1, -1},{1, 1},{1, -1}};

        Map<String, int[]> move = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            move.put(s[i], xy[i]);
        }

        return move;
    }
}
/**
 * 8*8 크기의 체스판에 왕과 돌이 있다.
 *
 * 알파벳 : 열 (가장 왼쪽 A 가장 오른쪽 H)
 * 숫자 : 행 (가장 아래가 1 가장위가 8)
 *
 * R : 한 칸 오른쪽으로
 * L : 한 칸 왼쪽으로
 * B : 한 칸 아래로
 * T : 한 칸 위로
 * RT : 오른쪽 위 대각선으로
 * LT : 왼쪽 위 대각선으로
 * RB : 오른쪽 아래 대각선으로
 * LB : 왼쪽 아래 대각선으로
 *
 * 킹이나 돌이 체스판 밖으로 나가면 다음 이동으로 넘어감
 * 킹이 돌이 있는곳으로 이동하면, 돌을 킹이 움직인 방향과 같은 방향으로 움직인다.
 */