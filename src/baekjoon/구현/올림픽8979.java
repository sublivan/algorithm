package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 8979 올림픽 (구현, 정렬)
 */
public class 올림픽8979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 국가의 수
        int K = Integer.parseInt(st.nextToken()); // 등수를 알고 싶은 국가


        Nation[] nations = new Nation[N + 1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int name = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());

            nations[name] = new Nation(name, gold, silver, bronze);
        }

        int rank = getRank(K, nations);

        System.out.println(rank);

        br.close();
    }

    /**
     * 금, 은, 동 개수에 따라 등수를 정한다.
     * 등수 선별 규칙
     * 1. 금메달 수가 더 많은 나라
     * 2. 금메달 수 가 같으면, 은메달 수가 더 많은 나라
     * 3. 금, 은메달 수가 모두 같으면, 동메달 수가 더 많은 나라.
     * 4. 메달의 색과 수가 모두 같으면 공동 등수
     *
     * @param K
     * @param nations
     * @return rank
     */
    private static int getRank(int K, Nation[] nations) {
        int rank = 1;
        for (int i = 1; i < nations.length; i++) {
            if (nations[i].gold > nations[K].gold) {
                rank++;
            } else if ((nations[i].gold == nations[K].gold) && (nations[i].silver
                > nations[K].silver)) {
                rank++;
            } else if ((nations[i].gold == nations[K].gold) && (nations[i].silver == nations[K].silver) && (
                nations[i].bronze > nations[K].bronze)) {
                rank++;
            }
        }
        return rank;
    }
}

class Nation {
    int name;
    int gold;
    int silver;
    int bronze;

    Nation(int name, int gold, int silver, int bronze) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}