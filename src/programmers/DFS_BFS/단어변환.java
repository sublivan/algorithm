package programmers.DFS_BFS;

import java.util.ArrayList;
import java.util.Arrays;

public class 단어변환 {

    public int solution(String begin, String target, String[] words) {
        int convertCnt = 0;
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(words));

        if (!wordList.contains(target)) {
            return 0;
        }
        for (String word : wordList) {
            if (isConvertPossible(begin, target)) {
                convertCnt++;
                break;
            }
            if (isConvertPossible(begin, word)) {
                begin = word;
                convertCnt++;
            }
        }
        return convertCnt;
    }

    public boolean isConvertPossible(String base, String compare) {
        int same = 0;

        for (int i = 0; i < base.length(); i++) {
            if (base.charAt(i) == compare.charAt(i)) {
                same++;
            }
        }
        if (same == base.length() - 1) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) { // Test용
        String[] begin = {"hit", "hit", "hot"};
        String[] target = {"cog", "cog", "lot"};
        String[][] words = {{"hot", "dot", "dog", "lot", "log", "cog"}, {"hot", "dot", "dog", "lot", "log"}, {"hot", "dot", "dog", "lot", "log"}};
        // 4, 0, 1

        for (int i = 0; i < begin.length; i++) {
            System.out.println("answer : " + new 단어변환().solution(begin[i], target[i], words[i]) + "\n");
        }
    }
}
