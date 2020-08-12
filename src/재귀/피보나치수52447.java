package 재귀;

import java.util.Scanner;

public class 피보나치수52447
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fivonaci(num));
    }

    private static int fivonaci(int n)
    {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fivonaci(n - 1) + fivonaci(n - 2);
    }
}
