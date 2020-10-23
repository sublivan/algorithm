package programmers;

public class 문자열다루기기본 {
    public boolean solution(String s) {

        if(s.length() == 4 || s.length() == 6)
        {
            for(int i = 0; i < s.length(); i++)
            {
                if('0' > s.charAt(i) || s.charAt(i) > '9')
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}
