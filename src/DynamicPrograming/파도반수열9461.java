package DynamicPrograming;

import java.util.Scanner;

public class 파도반수열9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[] p = new long[101];
        p[0] = 1;
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        p[4] = 2;
        p[5] = 2;

        for(int i =6; i <= 100; i++){
            p[i] = p[i-1] + p[i-5];
        }

        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(p[n]);
        }

    }
}
