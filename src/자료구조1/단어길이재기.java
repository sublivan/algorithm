package 자료구조1;

import java.io.*;

public class 단어길이재기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String str=br.readLine();

        bw.write(str.length()+"");
        bw.close();

    }

}
