package programmers.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long x = -1;
        if(n == 1)
            return 4;
        for(long i = 1 ; i <= n / 2; i++)
        {
            if(i * i == n) {
                x = i;
                break;
            }
        }
        if(x > 0) {
            return (x + 1) * (x + 1);
        }
        return x;
    }
}
