package programmers.level1;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        int index = -1;
        //1)
        for (int i = 0; i < seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {
                index = i;
                break;
            }
        }
        //2)
        //index = Arrays.asList(seoul).indexOf("Kim");

        answer += "김서방은 "+index+"에 있다";
        return answer;
    }
}
