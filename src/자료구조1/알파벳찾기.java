package 자료구조1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        Map<Character, Integer> alpabet = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alpabet.put((char) (i + 'a'), -1);
        }
        for (int i = 0; i < n; i++) {
            char compare = str.charAt(i);
            if (alpabet.get(compare) != -1)
                continue;
            if (alpabet.containsKey(compare)) {
                alpabet.put(compare, i);
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : alpabet.keySet()) {
            int result = alpabet.get(c);
            sb.append(result + " ");
        }
        System.out.println(sb.toString());
    }
}
