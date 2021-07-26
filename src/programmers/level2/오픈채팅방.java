package programmers.level2;
// 2019 KAKAO BLIND RECRUITMENT

import java.util.*;

public class 오픈채팅방 {

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        오픈채팅방 main = new 오픈채팅방();
        System.out.println(Arrays.toString(main.solution(record)));
    }

    class Log {
        String id;
        String state;
        String nick;

        public Log(String[] logs) {
            this.id = logs[1];
            this.state = logs[0];
            if (state.equals("Leave")) {
                nick = "";
            } else {
                this.nick = logs[2];
            }
        }
    }

    public String[] solution(String[] record) {
        Map<String, String> userInfo = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for (String data : record) {
            Log currentLog = new Log(data.split(" "));

            if (!currentLog.state.equals("Leave")) {
                userInfo.put(currentLog.id, currentLog.nick);
            }
        }

        for (String data : record) {
            Log currentLog = new Log(data.split(" "));

            if (currentLog.state.equals("Enter")) {
                result.add(userInfo.get(currentLog.id) + "님이 들어왔습니다.");
            }
            if (currentLog.state.equals("Leave")) {
                result.add(userInfo.get(currentLog.id) + "님이 나갔습니다.");
            }
        }
        return result.toArray(new String[result.size()]);
    }
}

/*
닉네임 변경하는 방법

1. 채팅방을 나간 후, 새로운 닉네임으로 다시 들어간다
2. 채팅방에서 닉네임을변경한다

닉네임을 변경할 때는 기존에 채팅방에 출력되어 있던 메시지의 닉네임도 전부 변경된다.

입장
Enter [유저아이디] [닉네임]

닉네임 변경
Change [유저아이디] [바꿀닉네임]

퇴장
Leave [유저아이디]
 */
