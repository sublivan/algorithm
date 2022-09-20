package programmers.level1;

import java.util.*;

/**
 * 프로그래머스 level1 - 성격유형검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
public class 성격유형검사하기 {

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        int[] choiceScores = {0, 3, 2, 1, 0, 1, 2, 3};
        char[][] types = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        Map<Character, Integer> surveyMap = new HashMap<>();
        for(char[] type : types) {
            surveyMap.put(type[0], 0);
            surveyMap.put(type[1], 0);
        }

        for (int i = 0; i < survey.length; i++) {
            char suervey1 = survey[i].charAt(0);
            char suervey2 = survey[i].charAt(1);

            int choice = choices[i];

            if (choice < 4) {
                surveyMap.put(suervey1, surveyMap.get(suervey1) + choiceScores[choice]);
            } else if (choice > 4){
                surveyMap.put(suervey2, surveyMap.get(suervey2) + choiceScores[choice]);
            }
        }


        for(char[] type : types) {
            char type1 = type[0];
            char type2 = type[1];


            if (surveyMap.get(type1) > surveyMap.get(type2)) {
                answer += type1;
            } else if (surveyMap.get(type1) == surveyMap.get(type2)) {
                answer += type1 < type2  ? type1 : type2;
            } else {
                answer += type2;
            }
        }

        return answer;
    }
}
