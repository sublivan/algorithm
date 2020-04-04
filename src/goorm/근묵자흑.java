package goorm;
//첫줄, n 수열의 길이, k 한번에 연속적으로 골라야하는 정수의 갯수 (2이상 n이하)
//두번째줄, 공백으로 구분된 n개의 정슈, 같은 정수 두번이상  나타나지 x
/*
입력예시
4 3
2 3 1 4
출력
        4
        */
//주어진 수열을 모두 같은 수로 만들고자 할 때 골라야 하는 최소 횟수를 출력

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 근묵자흑 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        String[] str = br.readLine().split(" ");

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        int index=0;
        int min=100001;
        int result=0;
        Arrays.sort(a);
        min =a[0];
        for(int i=1; i<n ;i++){
            if(a[i] == min)
                continue;
            int rope=k-1;
            int j=i;
            while(rope>0){
                a[j] =min;
                if(j<n-1)
                    j++;
                rope--;
            }
            result++;
        }
        System.out.println(result);

    }
}

