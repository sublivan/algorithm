package 자료구조1;

import java.io.*;


public class 네수 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str= br.readLine().split(" ");

        long result=0;

        String ab=str[0]+str[1];
        String cd=str[2]+str[3];

        result=Long.parseLong(ab)+Long.parseLong(cd);

        wr.write(result+"");
        wr.close();
    }
}
