package programmers.level1;

public class 음향더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        //1)
        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == false) {
                answer -= absolutes[i];
            } else {
                answer += absolutes[i];
            }
        }

        //2)
        // for (int i = 0; i < signs.length; i++) {
        //     answer += absolutes[i] * (signs[i] == true ? 1 : -1);
        // }

        return answer;
    }
}
