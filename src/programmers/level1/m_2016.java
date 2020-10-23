package programmers.level1;

public class m_2016 {
    public static void main(String[] args)
    {
        System.out.println(solution(5, 24));
    }
    public static String solution(int a, int b) {
        String[] day ={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[]  month = {31, 29, 31, 30, 31, 30 ,31, 31, 30 ,31, 30 ,31};
        String[] year = new String[366];

        for(int i = 0; i < year.length; i++)
        {
            year[i] = day[(i + 5) % 7] ;
        }

        int today = 0;
        for(int i = 0 ; i < a - 1; i++)
        {
            today += month[i];
        }
        //1월1일 부터니까 하루지낫다고 생각해서 -1
        today += b - 1;
        String answer = year[today];
        return answer;
    }

}


/*
윤년
1월 1일 수요일
12월 31일 목요일
 */