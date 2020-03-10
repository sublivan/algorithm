package 안경잡이개발자.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] time =new int[n];
        for(int i=0;i<n;i++){
            time[i]=Integer.parseInt(input[i]);
        }

        Arrays.sort(time);
        int result=0;

        for(int i=0;i<n;i++){
            //걸리는 시간* 기다리는 사람 수 =남은 사람이 총기다리는 수
            result += time[i]*(n-i);

        }
        System.out.println(result);
    }
}
