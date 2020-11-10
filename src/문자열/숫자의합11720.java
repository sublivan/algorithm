package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합11720 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         int num= 0;
         int result = 0;
         String[] str = br.readLine().split("");
        for(int i =0 ; i < n; i++)
         {
             num = Integer.parseInt(str[i]);
             result += num;
         }
        System.out.println(result);
    }
}
