package programmers.level1;

public class 약수의개수와덧셈 {
    //1)
//     public int solution(int left, int right) {
//         int answer = 0;

//         for (int i = left; i <= right; i++) {
//             if (divsorCount(i) % 2 == 1) { //약수의 갯수 판별
//                 answer -= i;
//             } else {
//                 answer += i;
//             }
//         }

//         return answer;
//     }

//     private int divisorCount(int num) {
//         int cnt = 0;
//         for (int i = 1; i * i <= num; i++) {
//             if (num % i == 0) {
//                 cnt++;
//                 if (i * i < num) {
//                     cnt++;
//                 }
//             }
//         }
//         System.out.println("count : " + cnt);
//         return cnt;
//     }

    //2) 제곱수 활용, Math.sqrt() 활용
    /*
    제곱수의 성질
    - 같은 두 자연수의 곱으로 나타낼수 있다.
    - 제곱수의 약수의 갯수는 항상 홀수 이다.
    */
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) { //제곱수
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}
