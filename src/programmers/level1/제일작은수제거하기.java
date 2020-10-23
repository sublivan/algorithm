package programmers.level1;

import java.util.*;
public class 제일작은수제거하기 {

    public int[] solution(int[] arr)
    {
        int[] answer;
        if(arr.length == 1)
        {
            return answer = new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        for(int v : arr)
        {
            if(v < min)
                min = v;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != min)
                list.add(arr[i]);
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
//    public int[] solution(int[] arr){
//        int[] answer;
//        if(arr.length == 1)
//        {
//            return answer = new int[]{-1};
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int v : arr)
//        {
//            list.add(v);
//        }
//        //Integer 로 받지 않으면 다른 수 가 저장됨
//        Integer min = Collections.min(list);
//        list.remove(min);
//        answer = new int[list.size()];
//        for(int i = 0; i < list.size(); i++)
//        {
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }


}
