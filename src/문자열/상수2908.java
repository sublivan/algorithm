package 문자열;

import java.util.Scanner;

public class 상수2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String temp ="";
        int n1;
        int n2;
        for(int i=s1.length() - 1; i >= 0; i--)
        {
            temp +=s1.charAt(i);
        }
        s1 = temp;
        temp = "";
        for(int i=s2.length() - 1; i >= 0; i--)
        {
            temp +=s2.charAt(i);
        }
        s2 = temp;
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        System.out.println(n1 > n2 ? n1 : n2);
    }
}
