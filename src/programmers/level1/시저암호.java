package programmers.level1;

public class 시저암호 {

    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                answer += ch + n > 'z'? (char)((ch + n) - 26) : (char)(ch + n);
            }
            else if(Character.isUpperCase(ch))
            {
                answer += ch + n > 'Z'? (char)((ch + n) - 26) : (char)(ch + n);
            }
            else if(ch == ' ')
                answer += ' ';
        }
        return answer;
    }
}
