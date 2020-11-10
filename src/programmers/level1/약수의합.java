package programmers.level1;

public class 약수의합 {

    public int solution(int n) {
        int answer = 0;

        if(n == 0)
            return 0;
        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
                answer += i;
        }
        return answer + n;

//        for(int i = 1; i <= n; i++){
//            if(n % i == 0){
//                answer += i;
//            }
//        }
//        return answer;
    }
}
//n의 약수는 n/2 보다 크지 않다
