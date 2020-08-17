package 브루트포스;

import java.util.*;

public class 덩치7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int y;
        int[] 덩치 = new int[200];
        Map<Integer, Integer> map = new HashMap<>();
        while(n-- > 0)
        {
            x = sc.nextInt();
            y = sc.nextInt();

            map.put(x, y);
        }
//        for(int i = 0; i < 200; i++)
//        {
//            for(int j = 0; j < 200; j++)
//            {
//                System.out.print(덩치[i][j]);
//            }
//        }


    }
}
