package 문자열;

import java.util.*;

public class 단어공부1157 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] count = new int[26];
        int max = 0;
        char result = '?';

        for(int i = 0; i < str.length(); i++)
        {
            //카운트에 문자갯수 집어 넣기 65(A)-65 = 0(인덱스)
            count[str.charAt(i) - 65]++;
            if(max < count[str.charAt(i) - 65])
            {
                max = count[str.charAt(i) - 65];
                result = str.charAt(i);
            }
            else if(max == count[str.charAt(i) - 65])
                result = '?';
        }
        System.out.println(result);
        sc.close();
    }
}
