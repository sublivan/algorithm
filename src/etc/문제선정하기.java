package etc;

import java.io.*;
import java.util.Arrays;

public class 문제선정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] =Integer.parseInt(str[i]);
        }

        Arrays.sort(a);
        int result=1;
        int standard = a[0];
        for(int i=1;i<a.length;i++){
            if(standard != a[i]){
                result++;
            }
            else if(result >=3){
                break;
            }
            standard = a[i];
        }
        System.out.println( result>=3? "YES":"NO");
    }
}
