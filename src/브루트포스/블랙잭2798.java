package 브루트포스;

import java.io.*;
import java.util.*;

public class 블랙잭2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] card = new int[n];
        ArrayList<Integer> result = new ArrayList<>();
        str = br.readLine().split(" ");
        int i = 0;
        for(String s : str)
            card[i++] = Integer.parseInt(s);

        int max = 0;
        int cp;
        Arrays.sort(card);
        for(i = 0 ; i <= card.length - 3; i++)
        {
            for(int j = i + 1; j <= card.length - 2; j++)
            {
                for(int k = j + 1; k <= card.length - 1; k++)
                {
                    cp = card[i] + card[j] + card[k];
                    if (cp <= m && max < cp)
                        max = cp;
                }
            }
        }
        System.out.println(max);
    }
}
