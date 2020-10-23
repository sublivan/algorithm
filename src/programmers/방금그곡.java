package programmers;

//2018 KAKAO BLIND RECRUITMENT
//https://programmers.co.kr/learn/courses/30/lessons/17683

import java.util.*;

public class 방금그곡 {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        String[] startArr;
        String[] endArr;

        String[] temp;
        String info ="";

        int playHour;
        int play;
        String title;

        int maxRun = 0;
        String code = convertCode(m);

        for(int i = 0; i < musicinfos.length; i++)
        {
            temp = musicinfos[i].split(",");
            startArr = temp[0].split(":");
            endArr = temp[1].split(":");

            playHour = Integer.parseInt(endArr[0]) - Integer.parseInt(startArr[0]);
            play = Integer.parseInt(endArr[1]) - Integer.parseInt(startArr[1]) + (playHour * 60);
            title = temp[2];
            info = makeMusic(temp[3], play);

            if(info.contains(code) == true)
            {
                if(maxRun < play)
                {
                    maxRun = play;
                    answer = title;
                }
            }
        }
        return answer;
    }

    public String makeMusic(String code, int play)
    {
        code = convertCode(code);
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < play ; i++)
        {
            sb.append(code.charAt(i % code.length()));
        }
        return sb.toString();
    }

    public String convertCode(String code)
    {
        String[] sharp = {"A#", "C#", "D#", "F#", "G#"};
        String[] convert = {"a", "c", "d", "f", "g"};

        for(int i = 0; i < sharp.length; i++)
        {
            code = code.replaceAll(sharp[i], convert[i]);
        }
        return code;
    }
}