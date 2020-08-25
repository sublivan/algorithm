package 정렬;

import java.io.*;
import java.util.*;

public class 나이순정렬_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] member = new String[n][3];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            member[i][0] = str[0];
            member[i][1] = str[1];
            member[i][2] = (i + 1) + "";
        }

        Arrays.sort(member, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])) {
                    return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
                }
                return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
            }
        });

        for (int i = 0; i < n; i++)
        {
            System.out.println(member[i][0] + " " + member[i][1]);
        }
    }
}
