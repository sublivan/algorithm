package programmers.level1;

import java.util.Calendar;

public class m_2016 {
    public static void main(String[] args)
    {
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
        String[] day ={"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, a - 1);
        calendar.set(Calendar.DATE, b);

        int get_day_index = calendar.get(Calendar.DAY_OF_WEEK);

        String answer = day[get_day_index - 1];
        return answer;
    }


    public String solution2(int a, int b) {
        String[] day_of_week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30 ,31, 31, 30 ,31, 30 ,31};
        String[] day_of_year = new String[366];

        for(int i = 0; i < day_of_year.length; i++)
        {
            day_of_year[i] = day_of_week[(i + 5) % 7] ;
        }

        int today = 0;
        for(int i = 0 ; i < a - 1; i++)
        {
            today += month[i];
        }

        today += b - 1; //1월1일 부터니까 하루지낫다고 생각해서 -1
        String answer = day_of_year[today];

        return answer;
    }
}


/*
윤년
1월 1일 수요일
12월 31일 목요일
 */