package programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {
        카펫 카펫 = new 카펫();
        System.out.println(Arrays.toString(카펫.solution(10, 2)));
        System.out.println(Arrays.toString(카펫.solution(8, 1)));
        System.out.println(Arrays.toString(카펫.solution(24, 24)));
        System.out.println(Arrays.toString(카펫.solution(50, 22)));
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        int height = 3;
        while (true) {
            if (area % height == 0) {
                int width = area / height;
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
            height++;
        }
        return answer;
    }
}

/*
1 8  3 3
2 10 4 3


24 24 8 6
 */