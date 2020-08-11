package 수학;

import java.io.*;

public class 분수찾기1193ㅅ {
    public static void main(String[] args) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int  x = Integer.parseInt(br.readLine());

       int line = 0;
       int cnt = 0;
       int top;
       int bottom;

       while(cnt < x)
       {
           line++;
           cnt = line * (line + 1)/2;
       }
       if(line % 2 == 0)
       {
           top = line - (cnt - x);
           bottom = 1 + (cnt - x);
       }
       else
       {
           top = 1 + (cnt - x);
           bottom = line - (cnt - x);
       }
       System.out.println(top + "/" + bottom);

    }
}
//한번더 풀어봐야됨