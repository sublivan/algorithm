package programmers.level2;


public class 피보나치수 {

    public static void main(String[] args) {
        피보나치수 main = new 피보나치수();

        System.out.println(main.solution(99999));
    }

    public int solution(int n) {
        int[] fibonaci = new int[n + 1];
        fibonaci[0] = 0;
        fibonaci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonaci[i] = (fibonaci[i - 1] + fibonaci[i - 2]) % 1234567;
        }
        return fibonaci[n];
    }
}
