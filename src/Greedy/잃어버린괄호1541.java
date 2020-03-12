package Greedy;

import java.io.*;
import java.util.Arrays;

public class 잃어버린괄호1541 {
    public static void main(String[] args) throws IOException {
        //2)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //-를 기준으로 나누기
        String[] str = br.readLine().split("\\-");
        System.out.println(Arrays.toString(str));
        //처음 - 전까지 모두 더하기
        String[] plus = str[0].split("\\+");
        System.out.println(Arrays.toString(plus));
        int plusSum=0; //첫 - 나오기전 수자 합저장
        int minusSum=0; //첫 -나온후 숫자 합 저장

        for(String t : plus){
            plusSum+= Integer.parseInt(t);
        }
        //처음 - 숫자 이후 더하기
        for(int i=1;i< str.length;i++){
            String[] temp = str[i].split("\\+");
            for(String t : temp)
                minusSum += Integer.parseInt(t);
        }
        int minResult=plusSum-minusSum;//최솟값 저장
        System.out.println(minResult);

        // 1)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        //-를 기준으로 문자열을 나눈다
//        String[] str =br.readLine().split("\\-");
//        //계산 담당
//        int temp=0;
//        //최종 최솟값 담을 변수
//        int minResult=0;
//        String[] s;
//        for(int i=0;i<str.length;i++){
//            //-로 추출한 문자열에서 다시 +부분도 생각해서 숫자만 추출해서 더해주는연산
//            s = str[i].split("\\+");
//            for(int j=0; j<s.length;j++){
//                temp += Integer.parseInt(s[j]);
//            }
//            if(i == 0 ) temp *= -1;
//        }
//        System.out.println(-temp);
    }
}