package programmers;

public class 이상한문자만들기 {
    public static String solution(String s) {
        String answer = "";
        char[] crr = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < crr.length; i++)
        {
            if(crr[i] == ' ') {
                cnt = 0;
                answer += crr[i];
            }
            else if(cnt == 0 || cnt % 2 == 0)
            {
                cnt++;
                answer += (crr[i] + "").toUpperCase();
            }
            else if(cnt % 2 == 1)
            {
                cnt++;
                answer += (crr[i] + "").toLowerCase();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}