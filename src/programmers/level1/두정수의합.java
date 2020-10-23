package programmers.level1;

public class 두정수의합 {

    public long solution(int a, int b) {
        long answer = 0;
        if(a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        for(int i = a; i <= b; i++)
        {
            answer += i;
        }
        return answer;
    }


}
// 등차수열 합공식 이용하면 편하다
// n(첫째항 + 마지막항) / 2