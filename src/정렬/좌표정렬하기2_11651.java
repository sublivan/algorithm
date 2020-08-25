package 정렬;

<<<<<<< HEAD
public class 좌표정렬하기2_11651 {
    public static void main(String[] args)
    {

=======
import java.util.*;
import java.io.*;

public class 좌표정렬하기2_11651 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][2];

        for(int i = 0; i < n; i++)
        {
            String[] str = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(str[0]);
            map[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(map, new Comparator<int []>() {
            public int compare(int[] a, int[] b)
            {
                if(a[1] == b[1])
                {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        });

        for(int i = 0; i < n; i++)
        {
            System.out.println(map[i][0] + " " + map[i][1]);
        }
>>>>>>> 09e6b57f4429492f5a08fee833c37838d5bdb96b
    }
}
