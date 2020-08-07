package 수학;

import java.util.Scanner;

public class 손익분기점1712 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n= 1;
        while(a+b*n >= c*n)
        {
            n++;
        }
        System.out.println(n);
    }
}
