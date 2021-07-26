package programmers.level1;

/*
2018 KAKAO BLIND RECRUITMENT
level 1
 */
import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        int n = 5;
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        int[][] map1 = make_map(arr1);
        int[][] map2 = make_map(arr2);
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map1[i][j] != map2[i][j])
                    result[i][j] = 1;
                else
                    result[i][j] = map1[i][j];
            }
        }
        answer = new String[n];
        int index = 0;
        for (int[] i : result) {
            StringBuilder sb = new StringBuilder();
            //숫자에 맞게 #과 공백으로 변환
            for (int j : i) {
                if (j == 1)
                    sb.append('#');
                else
                    sb.append(' ');
            }
            answer[index++] = sb.toString();
        }
        return answer;
    }

    //맵 만드는 메소드
    private static int[][] make_map(int[] arr) {
        int[][] map = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int cal = arr[i];
            int index = arr.length - 1;
            //이진수로 변환
            while (cal > 0) {
                map[i][index] = cal % 2;
                cal /= 2;
                index--;
            }
        }
        return map;
    }

    //만들어진 맵을 확인하기 위한 메소드
    private static void map_toString(int[][] map) {
        for (int[] i : map) {
            for (int j : i) {
                if (j == 1)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
