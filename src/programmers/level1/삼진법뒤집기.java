package programmers.level1;


public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;

        String reverseBase3 = makeReverseBase3(n);

        int power = 0;
        for (int i = reverseBase3.length() - 1; i >= 0; i--) {
            int value = reverseBase3.charAt(i) - '0';
            answer += value * Math.pow(3, power);
            power++;
        }

        return answer;
    }

    public String makeReverseBase3(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3 + "";
            n /= 3;
        }
        return str;
    }
}
