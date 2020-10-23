package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());

        int[] rope =new int[100001];

        for(int i=0; i<n ;i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope,0,n);

        
        int max=0;

        for(int i=0; i<n ;i++){
            if(max < rope[i]*(n-i)) max = rope[i] * (n-i);
        }

        System.out.println(max);

    }
}
