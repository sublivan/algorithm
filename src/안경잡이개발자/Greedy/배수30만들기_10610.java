package 안경잡이개발자.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
30의 배수가 되기 위한 조건
1. 0이 있어야한다
2. 각자리수의 합이 3의 배수라면, 전체 숫자는 항상 3의 배수이다.
 */
public class 배수30만들기_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] str =br.readLine().split("");
        int temp=0;  //각자리 숫자합 담을 변수
        int[] a=new int[str.length]; //입력받은 숫자 담을 배열
        for(int i=0;i<str.length;i++){
            a[i] = Integer.parseInt(str[i]);
            temp +=Integer.parseInt(str[i]);
        }
        Arrays.sort(a); //0을찾기 위해 오름차순으로 정렬
        if(temp%3 ==0 && a[0] ==0){

            for(int i=a.length-1; i>=0 ;i--){
                System.out.print(a[i]);
            }
        }
        else{
            System.out.println(-1);
        }




    }
}
