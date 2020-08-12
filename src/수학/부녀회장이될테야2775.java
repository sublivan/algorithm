package 수학;

import java.util.*;

public class 부녀회장이될테야2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k;
        int n;
        int[][] person = new int[15][15];
        for(int i= 1; i < 15; i++)
        {
            person[0][i] = i;
        }
        for(int i= 1; i < 15; i++)
        {
            for(int j = 1; j < 15; j++)
            {
                person[i][j] = person[i - 1][j] + person[i][j - 1];
            }
        }
        while(t-- > 0)
        {
            k = sc.nextInt();
            n = sc.nextInt();

            System.out.println(person[k][n]);
        }
    }
}

/*
“a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
  양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
  단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 */
