package programmers.level1;

import java.util.*;

//2018 KAKAO BLIND RECRUITMENT
public class 다트게임 {
    public int solution(String dartResult) {
        dartResult = dartResult.replaceAll("10", "K");
        char[] detail = dartResult.toCharArray();
        int[] result = new int[3];
        int idx = -1;
//        System.out.println(Arrays.toString(detail));
        for (int i = 0; i < detail.length; i++)
        {
            char now = detail[i];
            if (now == 'S')
            {
                result[idx] = (int)Math.pow(result[idx], 1);
            }
            else if (now == 'D')
            {
                result[idx] = (int)Math.pow(result[idx], 2);
            }
            else if (now == 'T')
            {
                result[idx] = (int)Math.pow(result[idx], 3);
            }
            else if (now == '*')
            {
                if (idx == 0)
                {
                    result[idx] *= 2;
                }
                else
                {
                    result[idx] *= 2;
                    result[idx - 1] *= 2;
                }
            }
            else if (now == '#')
            {
                result[idx] *= -1;
            }
            else
            {
                if (now == 'K')
                {
                    result[++idx] = 10;
                }
                else
                    result[++idx] = now - '0';
            }
        }
        int answer = 0;
        for (int v : result)
        {
            answer += v;
        }
//        System.out.println(Arrays.toString(result));
        return answer;
    }
}

/*
점수 0 ~ 10

입력)
점수|보너스|[옵션]

핵심)
제곱 함수
Math.pow(밑, 지수);
입출력 모두 실수(double)

숫자 10일때를 따로 처리해야한다.
입력받은 인자를 toCharArray()를 했을때 10이면 1, 0 으로 나눠지게 된다.
그걸 방지하기 위해 문자열을 나누기 전에,숫자가 10인 수를 임의의 문자(K)로 바꾸어 준다
 */