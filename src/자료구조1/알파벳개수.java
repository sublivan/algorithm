package 자료구조1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 알파벳개수 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        HashMap<Character,Integer> alpabet =new HashMap<>();
        int i;
        for(i=0;i<26;i++){
            alpabet.put((char)('a'+i),0);
        }

        int n=str.length();
        int count=0;
        for(i=0;i<n;i++){
            char compare=str.charAt(i);
            if(alpabet.containsKey(compare)){
                count=alpabet.get(compare)+1;
                alpabet.put(compare,count);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:alpabet.keySet()){
            int result=alpabet.get(c);
            sb.append(result+" ");
        }
        System.out.println(sb.toString());


    }
}
