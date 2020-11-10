package programmers.level1;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args)
    {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        for(i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] != arr[i + 1])
                list.add(arr[i]);
        }
        list.add(arr[i]);

        int[] answer  = new int[list.size()];
        for(i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
