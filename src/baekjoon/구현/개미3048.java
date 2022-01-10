package baekjoon.구현;

import java.io.*;
import java.util.*;

public class 개미3048 {
    static class Ant {
        String name;
        String dir;

        public Ant(String name, String dir) {
            this.name = name;
            this.dir = dir;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        List<String> rightAnts = new ArrayList<>(Arrays.asList(br.readLine().split("")));
        List<String> leftAnts = new ArrayList<>(Arrays.asList(br.readLine().split("")));
        Collections.reverse(rightAnts);

        List<Ant> ants = new ArrayList<>();

        for (int i = 0; i < N1; i++) {
            ants.add(new Ant(rightAnts.get(i), "right"));
        }
        for (int i = 0; i < N2; i++) {
            ants.add(new Ant(leftAnts.get(i), "left"));
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            for (int i = 0; i < ants.size() - 1 ; i++) {
                Ant current = ants.get(i);
                Ant next = ants.get(i + 1);

                if (current.dir.equals("left") || current.dir.equals(next.dir)) {
                    continue;
                }

                ants.set(i, next);
                ants.set(i + 1, current);
                i++;
            }
        }

        for (Ant ant : ants) {
            System.out.print(ant.name);
        }

        br.close();
    }
}

/**
 * 기준이 되는 방향은 한개로만 정한다
 * 현재 기준인 개미의 진행방향과 다음 개미의 진행방향이 다르면 서로 위치를 바꾼다
 */