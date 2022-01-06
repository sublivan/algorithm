package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문자열단계2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int k;
        String str;
        char c;
        while(n-- > 0)
        {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for(int i =0; i < str.length(); i++)
            {
                c = str.charAt(i);
                for(int j = 0; j < k; j++)
                {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
