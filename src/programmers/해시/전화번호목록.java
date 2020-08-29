package programmers.해시;

import java.util.*;

public class 전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        String cp;

        for(int i = 0; i < phone_book.length; i++)
        {
            cp = phone_book[0];
            for(int j = i; j < phone_book.length - 2; j++)
            {
                if(phone_book[j + 1].contains(cp))
                {
                    return false;
                }
            }
        }
        return answer;
    }
}
