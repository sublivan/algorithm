package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> reportTotal = new HashMap<>();
        Map<String, List<String>> reportLog = new HashMap<>();
        Map<String, Integer> mailSendLog = new HashMap<>();

        for (String userId : id_list) {
            reportTotal.put(userId, 0);
            mailSendLog.put(userId, 0);
            reportLog.put(userId, new ArrayList<>());
        }
        
        for (String reportMsg : report) {
            String userId = reportMsg.split(" ")[0];
            String reportId = reportMsg.split(" ")[1];

            List<String> tempList = reportLog.get(userId);
            if (!tempList.contains(reportId)) {
                tempList.add(reportId);
                reportTotal.put(reportId, reportTotal.get(reportId) + 1);
            }
            reportLog.put(userId, tempList);
        }

        List<String> mostReports = new ArrayList<>();
        reportTotal.forEach((id, reportCnt) -> {
            if (reportCnt >= k) {
                mostReports.add(id);
            }
        });

        reportLog.forEach((userId, list) -> {
            mostReports.forEach((reportId) -> {
                if (list.contains(reportId)) {
                    mailSendLog.put(userId, mailSendLog.get(userId) + 1);
                }
            });
        });

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailSendLog.get(id_list[i]);
        }

        return answer;
    }
}



/**
 * 불량이용자 신고 및 처리결과 메일로 발송하는시스템 개발
 *
 * 조건
 * 1. 각 유저는 한 번에 한명의 유저를 신고할 수 잇다
 * - 신고횟수에 제한 없음
 * - 한 유저를 여러번 신고가능, 동일한 유저에 대한 신고 횟수는 1회처리
 *
 * 2. k번 이상 신고된 유저는 게시판 이용이 정지, 해당 유저를 신고한 모든 유저에게 정지사실 이메일로 발송
 * - 유저가 신고한 모든 냉요을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 메일 발송
 *
 *
 * id_list : 이용자의 ID가 담긴 문자열 배열
 * report : 각 이용자가 신고한 이용자의 ID정보가 담긴 문자열 배열
 * k : 정지 기준이 되는 신고 횟수
 *
 * answer : 각 유저별로 처리 결과 메일을 받은 횟수를 담은 배열
 */