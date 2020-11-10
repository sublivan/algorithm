package programmers.level1;

public class 최대공약수와최소공배수 {

    public int[] solution(int n, int m) {
        int[] answer = {};
        int minNum = Math.min(n, m);
        int num1 = n;
        int num2 = m;
        //최대공약수
        int gcd = 1;
        //최소공배수
        int lcm = 1;

        int i = 2;
        while(i <= minNum)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                num1 /= i;
                num2 /= i;
                minNum /= i;
                gcd *= i;
            }
            else
                i++;
        }
        lcm = gcd * num1 * num2;
        answer = new int[]{gcd, lcm};

        return answer;
    }
}
/*
최대공약수
- 서로소가 나올때까지 두 수의 공약수로 계속 나눠서 나온 공약수를 모두 곱

최소공배수
- 모든 공약수의 곱
 */
