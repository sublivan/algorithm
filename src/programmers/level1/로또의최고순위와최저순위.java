package programmers.level1;

import java.util.*;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        로또의최고순위와최저순위 main = new 로또의최고순위와최저순위();

        System.out.println(Arrays.toString(main.solution(lottos, win_nums)));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] lottoRank = {6, 6, 5, 4, 3, 2, 1};

        List<Integer> winNumlist = new ArrayList<>();

        //int 배열은 Arrays.asList() 통해 리스트로 변환할수 없다. 반목문을 사용해야함
        //https://hianna.tistory.com/552
        for (int win_num : win_nums) {
            winNumlist.add(win_num);
        }

        int max = 0;
        int min = 0;
        int unknown = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                unknown++;
            } else if (winNumlist.contains(lotto)) { //1)
                min++;
            }
        }

        max = min + unknown;

        return new int[]{lottoRank[max], lottoRank[min]};

    }
}
