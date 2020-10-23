package programmers.level1;

public class 가운데글자가져오기 {
    public static void main(String[] args)
    {
        String s = "qwer";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";
        int mid = s.length() / 2;

        if(s.length() % 2 == 0)
        {
            answer += s.charAt(mid - 1);
            answer += s.charAt(mid);
        }
        else
            answer +=s.charAt(mid);

        return answer;


    }


}
