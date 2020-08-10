package programmers;

import java.util.*;
public class 방금그곡
{

}

//완성아님
//https://programmers.co.kr/learn/courses/30/lessons/17683
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        String[] temp;
        int start;
        int end;
        int run;
        int cnt = 0;

        for(int i =0; i < musicinfos.length; i++)
        {
            temp = musicinfos[i].split(",");
            start = Integer.parseInt(temp[0].substring(3));
            end = Integer.parseInt(temp[1].substring(3));
            run = end - start;

            if(run != temp[3].length())
            {
                while(temp[3].length() < run)
                {
                    temp[3] +=temp[3];
                }
            }

            if(temp[3].contains(m) == true)
            {
                answer = temp[2];
                cnt++;
            }
        }
        if(answer.length() == 0)
            answer = "`(None)`";
        answer.l
        return answer;

    }
}