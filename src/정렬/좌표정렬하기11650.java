package 정렬;
import java.io.*;
import java.util.Arrays;

public class 좌표정렬하기11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(input[0]);
            map[i][1] = Integer.parseInt(input[1]);
        }
//        for(int i = 1; i < str.length; i++)
//        {
//            for(int j = 0; j < str.length - i; j++)
//            {
//                int r1 = (int)str[j].charAt(0) + (int)str[j].charAt(2);
//                int r2 = (int)str[j + 1].charAt(0) + (int)str[j + 1].charAt(2);
//                if(r1 > r2)
//                {
//                    String temp = str[j];
//                    str[j] = str[j + 1];
//                    str[j + 1] = temp;
//                }
//            }
//    }
//        for(String s : str) {
//            System.out.println(s);
//        }
    }




}
