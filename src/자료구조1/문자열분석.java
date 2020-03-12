package 자료구조1;

import java.io.*;

public class 문자열분석 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str="";
        int upper,lower,num,space;
        while((str = br.readLine()) != null){
            upper=0;lower=0;num=0;space=0;
            int n=str.length();

            for(int i=0; i<n ;i++){
                char c=str.charAt(i);
                if(c==' ') {
                    space++;
                    continue;
                }
                if(c>=65 && c<=90){
                    upper++;
                    continue;
                }
                if(c>=97 && c<=122){
                    lower++;
                    continue;
                }
                if(c>=48 && c<=57){
                    num++;
                    continue;
                }
            }
            System.out.println(lower+" "+upper+" "+num+" "+space);
        }

    }
}
