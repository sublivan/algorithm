package programmers.level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return -1;
    }
}
