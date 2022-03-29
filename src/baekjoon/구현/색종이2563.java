package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 흰색 도화지 가로세로 100
 * 검은색 정사각형 색종이 가로세로 10
 *
 * 첫번재는 색종이 왼쪽변과 도화지의 왼쪽변 사이의거리
 * 두번째는 색종이 아래쪽변과 도화지의 아래쪽변 사이의거리
 *
 * 풀이방법
 * 색종의 면적을 1로 표현하고, 1의 총 갯수를 센다.
 */

public class 색종이2563 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[][] positions = new int[100][100];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());

            for (int x = px; x < px + 10; x++) {
                for (int y = py; y < py + 10; y++) {
                    positions[x][y] = 1;
                }
            }
        }
        
        int areaCnt = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (positions[i][j] == 1) {
                    areaCnt++;
                }
            }
        }
        System.out.println(areaCnt);

    }
}