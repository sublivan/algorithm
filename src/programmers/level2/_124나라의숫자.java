package programmers.level2;

public class _124나라의숫자 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int mod;
        while (n != 0)
        {
            mod = n % 3;
            n /= 3;
            if (mod == 0)
            {
                n -= 1;
                mod = 4;
            }
            sb.insert(0, mod);

        }
        String answer = sb.toString();
        return answer;
    }
}