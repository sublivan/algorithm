package 정렬;
import java.io.*;
import java.util.*;

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
        Arrays.sort(map, new Comparator<int []>() {
            public int compare(int a[], int b[])
            {
                if(a[0] == b[0])
                    return Integer.compare(a[1], b[1]);
                else
                    return Integer.compare(a[0], b[0]);
            }
        });
        for(int i = 0; i < map.length; i++)
        {
            System.out.println(map[i][0] + " " + map[i][1]);
        }
    }
}
//시간초과주의
// x 좌표가 같으면 y 좌표를 기준으로 정렬하는게 포인트