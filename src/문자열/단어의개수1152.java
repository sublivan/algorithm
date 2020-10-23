package 문자열;

import java.io.*;

public class 단어의개수1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        char cp;
        if(!str.isEmpty() && str.charAt(0) != ' ')
            cnt++;
        for(int i = 0; i < str.length(); i++)
        {
            cp = str.charAt(i);
            if(cp == ' ' && i + 1 != str.length())
                cnt++;
        }
        System.out.println(cnt);
    }
}
