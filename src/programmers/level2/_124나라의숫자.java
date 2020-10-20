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
/*
3진법을 생각해보자
1 % 3 = 1 (124나라 1)
2 % 3 = 2 (124나라 2)
3 % 3 = 0 (124나라 4)

String numbers = {"4", "1", "2};

나머지가 0 일때 4이여야 한다.
즉, n % 3 = 0 일때 변환값을 4로 처리한다
또 하나의 규칙이 적용되는데 n 을 -1 해주는 것이다.

3 % 3 = 0;
3 / 3 = 1;

변환 4
1 - 1 = 0
루프 탈출

StringBuilder
    - .insert(index, value);
    index 위치에 value 값을 집어 넣는다.
 */