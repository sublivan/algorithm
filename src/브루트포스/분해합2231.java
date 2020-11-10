package 브루트포스;

import java.util.*;

public class 분해합2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = String.valueOf(n).length();
        int start = n - (9 * size);
        int answer = 0;

        for(int i = start; i < n; i++)
        {
            int sum = i;
            int j =  i;
            while(j > 0)
            {
                sum += j % 10;
                j /= 10;
            }
            if(sum == n)
            {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

/*
생성자의 최소 범위
n - (각 자리수 덧셈 * 자릿수)
 */
