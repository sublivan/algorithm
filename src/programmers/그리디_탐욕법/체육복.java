package programmers.그리디_탐욕법;

public class 체육복 {
    public static void main(String[] args)
    {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        //여벌옷을 가지고 온 학생이 도난당했을때 처리
        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if(lost[i] == reserve[j])
                {
                    //도난당한 여벌옷 소유자 -1로
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if(lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1)
                {
                    answer++;
                    //옷을 빌려줬다면 다른사람에게 빌려줄수 없게 처리
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
