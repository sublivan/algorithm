package programmers.정렬;

import java.util.*;

public class k번째수 {
    public static void main(String[] args)
    {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < commands.length; i++)
        {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int point = commands[i][2] - 1;
            int[] temp = new int[end - start + 1];
            int j = 0;
            for(int k = start; k <= end; k++)
            {
                temp[j] = array[k];
                j++;
            }
            Arrays.sort(temp);
            ans.add(temp[point]);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++)
        {
            answer[i] = ans.get(i);
        }
        return answer;
    }

}
