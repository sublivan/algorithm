package programmers.level2;

public class 문자열압축 {
    //리펙토링
    public int solution(String s) {
        int answer = s.length(); //문자열이 표현가능한 최대 길이
        if (answer == 1)
            return (1);
        //압축가능한 단위의 최대는 길이의 절반이다.
        for (int cutSize = 1; cutSize <= s.length() / 2; cutSize++)
        {
            //압축된 길이의 최소값 찾기
            answer = Math.min(answer, cut_string(s, cutSize));
        }
        return answer;
    }

    private int cut_string(String s, int cutSize)
    {
        String word; //압축가능한 길이 단위만큼 자른 시작문자열
        int same; //압축한 갯수
        StringBuilder sb; //압축된 문자열을 저장할 객체

        word = s.substring(0, cutSize);
        same = 1;
        sb = new StringBuilder();

        for (int i = cutSize; i <= s.length(); i += cutSize)
        {
            String cmp; //압축가능한 길이 단위만큼 자른 다음 문자열

            if (i + cutSize >= s.length()) //자르려는 길이가 s의 길이보다 크거나 같을때
                cmp = s.substring(i);
            else
                cmp = s.substring(i, i + cutSize); //현재 위치부터 단위만큼 자른다
            if (word.equals(cmp)) //문자열이 같을때
                same++;
            else{
                if (same > 1) //이전에 압축된 문자 처리
                {
                    sb.append(same + word);
                }
                else{
                    sb.append(word);
                }
                word = cmp;
                same = 1;
            }
        }
        //마지막에 비교된 문자 처리
        if (same != 1)
            sb.append(same);
        sb.append(word);
        return (sb.toString().length()); //압축된 문자열 길이 반환
    }

    /*
    처음 통과 풀이
    public int solution(String s) {
        int answer = s.length();
        //문자가 하나일때
        if (answer == 1)
            return (1);

        //문자열을 자르는 단위를 늘려가며 모든 경우를 비교
        //최대 압축가능한 길이는 문자열의 길이의 절반이다.
        for (int cutSize = 1; cutSize <= s.length() / 2; cutSize++)
        {
            String word = ""; //현재 문자열
            String next = ""; //비교할 다음 문자열
            String str = ""; //비교후 문자열 처리한것 담을 곳

            int same = 1;
            word = s.substring(0, cutSize); //문자의 시작부터 단위 만큼 자른다
            for (int i = cutSize; i <= s.length(); i += cutSize)// 현재 문자의 다음 위치의 문자들 비교
            {
                if (i + cutSize >= s.length()) //문자의 최대길이를 넘었을때
                    next = s.substring(i);
                else
                    next = s.substring(i, i + cutSize);
                if (word.equals(next)) //시작문자와 비교할 문자가 같을때
                    same++;
                else
                {
                    if (same > 1) //앞 문자에서 같은 문자가 있을때
                    {
                        str += same + word;
                    }
                    else
                    {
                        str += word;
                    }
                    same = 1;
                    word = next; //시작문자 변경
                }
            }
            //마지막 문자 처리
            if (same > 1)
            {
                str += same + word;
            }
            else
            {
                str += word;
            }
            answer = Math.min(answer, str.length());
        }
        return answer;
    }
     */
}

/*
문제 접근 방법
압축 가능한 길이를 1부터 문자열의 절반까지 정해준다.
- 최대 압축가능한 문자 길이는 절반이기 때문

문자열의 시작 부터 압축가능한 문자의 길이만큼 잘라준다.
그리고 현재 문자열 다음의 문자를 압축가능한 길이 만큼 자르고 둘을 비교한다.
문자열이 같으면 압축개수 증가
다르면 압축 갯수와 현재 압축된 시작문자열을 합쳐 전체 문자열에 더해준다.
시작문자열에 아까 비교한 다음 문자열을 넣고 재탐색한다.
cutSize만큼 압축한 문자열의 압축이 끝나면, 압축된 문자와 최소값과 비교한다.
이과정을 1부터 (최대 압축가능한 길이)문자열의 절반까지 반복한다.
 */