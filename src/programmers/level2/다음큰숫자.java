package programmers.level2;

public class 다음큰숫자 {

    public int solution(int n) {
        int nextBigNumber = n + 1;

        while (true) {
            if (Integer.bitCount(n) == Integer.bitCount(nextBigNumber)) {
                break;
            }
            nextBigNumber += 1;
        }
        return nextBigNumber;
    }
}

/*
다음 큰 숫자 조건
n보다 큰 자연수
n을 2진수로 변환했을때 1의 갯수와 다음 숫자의 1의갯수가 같다
1, 2를 만족하는 수 중 가장 작은 수
 */