package programmers.level1;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

//        String s = String.valueOf(n);
//        for(int i = 0; i < s.length(); i++)
//        {
//            answer += s.charAt(i) - '0';
//        }
        while(n > 0)
        {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
