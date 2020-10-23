package 자료구조1;

import java.io.*;

public class R0T13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String str=br.readLine();
        int n =str.length();
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<n ;i++){
            char c=str.charAt(i);
            if(c>=48 && c<=57 || c ==' ') {
                sb.append(c);
                continue;
            }
            if(c>=65 && c<=90){//대문자
                if(c+13 >90)
                    c =(char)(c-13);
                else
                    c =(char)(c+13);
                sb.append(c);
                continue;
            }
            if(c>=97 && c<=122) {//소문자
                if(c+13>122)
                    c =(char)(c-13);
                else
                    c =(char)(c+13);
                sb.append(c);
                continue;
            }
        }
        bw.write(sb.toString());

        bw.close();
    }

}
