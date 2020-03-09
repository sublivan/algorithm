package 안경잡이개발자;

import java.util.Arrays;
//O(N^2)
public class 삽입정렬 {
    public static void main(String[] args) {
        int i, j, temp;
        int a[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(i=0; i<9 ; i++){
            j=i;
            while(j>=0 && a[j] > a[j+1]){
                temp = a[j];
                a[j]=a[j+1];
                a[j+1] =temp;
                j--;
            }
        }
        System.out.print(Arrays.toString(a));
    }

}
