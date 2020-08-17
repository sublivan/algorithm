package 정렬;

import java.util.*;

public  class 소트인사이트1427  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        Arrays.sort(str);
        for(int i = str.length - 1; i >= 0; i--)
            System.out.print(str[i]);
    }
}
