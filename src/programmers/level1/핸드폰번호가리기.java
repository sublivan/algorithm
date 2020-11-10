package programmers.level1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length() - 4;
        for(int i = 0; i < size; i++)
        {
            answer += "*";
        }
        answer += phone_number.substring(size);
        return answer;
    }

//    public String solution(String phone_number) {
//        return phone_number.replaceAll(".(?=.{4})", "*");
////네문자 {4} 이전까지의 모든문자를 *로 대체
//    }
}
