package 재귀;

import java.util.*;
//다시 풀어봐야됨
public class 별찍기2447ㅅ
{
    static char[][] arr;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        arr = new char[n][n];

        make_star(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void make_star(int x, int y, int n, boolean blank)
    {
        if(blank == true)
        {
            for(int i = x; i < x + n; i++)
                for(int j = y; j < y + n; j++)
                    arr[i][j] = ' ';
            return;
        }
        if(n == 1)
        {
            arr[x][y] = '*';
            return;
        }
        int size = n / 3;
        int cnt = 0;
        for(int i = x; i < x + n; i += size)
        {
            for(int j = y; j < y + n; j += size)
            {
                cnt++;
                if(cnt == 5)
                    make_star(i, j, size, true);
                else
                    make_star(i, j, size, false);
            }
        }
    }
}
