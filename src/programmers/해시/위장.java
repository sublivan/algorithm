package programmers.해시;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 0;

        for(int i = 0; i < clothes.length; i++)
        {
            for(int j = i + 1; j < clothes.length;j ++)
            {
                if(!clothes[i][1].equals(clothes[j][1]))
                    answer++;
            }
        }
        answer +=clothes.length;
        return answer;
    }
}
