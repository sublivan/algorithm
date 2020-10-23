package 정렬;

import java.io.*;
import java.util.*;

public class 단어정렬1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> str = new ArrayList<String>(20001);

        for(int i =0; i <n ; i++){
            String temp= br.readLine();
            if(!str.contains(temp))
                str.add(temp);
        }
        Comparator<String> mySort = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if( s1.length() > s2.length()){
                    return 1;
                }
                else if( s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return -1;
            }
        };

        for(int i=0; i < str.size(); i++){
            System.out.println(str.get(i));
        }


    }
}
