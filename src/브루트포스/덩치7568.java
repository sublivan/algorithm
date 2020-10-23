package 브루트포스;

import java.util.*;

public class 덩치7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int y;
        int[][] 덩치 = new int[n][3];
        for(int i =0; i < n; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();
            덩치[i][0] = x;
            덩치[i][1] = y;
        }
        int cnt;
        for(int i = 0; i < 덩치.length; i++)
        {
            cnt = 0;
            for(int j = 0; j < 덩치.length; j++)
            {
                if (덩치[i][0] < 덩치[j][0] && 덩치[i][1] < 덩치[j][1])
                    cnt++;
            }
            덩치[i][2] = cnt + 1;
        }
        for(int i = 0; i < 덩치.length; i++)
        {
            System.out.print(덩치[i][2] + " ");
        }



    }
}
