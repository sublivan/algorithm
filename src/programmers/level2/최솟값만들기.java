package programmers.level2;

import java.util.Arrays;

public class 최솟값만들기 {
    public int solution(int[] A, int[] B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[A.length - 1 - i];
        }

        return sum;
    }

}

/*
배열 A, B에서 각각 한 개의 숫자를 뽑아 두수를 곱한다.

배열의 길이만큼 반복, 두 수를 곱한 값을 누적하여 더한다.

최정족으로 누적된 값이 최소가 되도록 만드는것이 목표
(k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없다.)

 */