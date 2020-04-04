package 자료구조1;


import java.util.Arrays;
import java.util.Scanner;

public class 접미사배열 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();

        String[] result =new String[str.length()];

        for(int i=0;i<str.length();i++){
            result[i]=(str.substring(i,str.length()));
        }

        Arrays.sort(result);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
