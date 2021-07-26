package programmers.level1;

public class 짝수와홀수 {
    public String solution(int num) {
        String answer = "";
        if(num < 0)
            num *= -1;
        if(num % 2 == 0)
            answer = "Even";
        else if(num % 2 == 1)
            answer = "Odd";
        return answer;
    }
}
