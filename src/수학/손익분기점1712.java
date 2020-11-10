package 수학;

import java.util.Scanner;

public class 손익분기점1712 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b >= c)
            System.out.println(-1);
        else
            System.out.println(a/(c - b) + 1);
        //수식을 계산해보면 a/(c-b> < x
        //손익분기점이 처음 발생할때 이므로 1을 더해서 계산
    }
}
