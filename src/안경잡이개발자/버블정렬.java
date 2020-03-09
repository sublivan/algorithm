package 안경잡이개발자;
//O(N^2)
import java.util.Arrays;

public class 버블정렬 {
    public static void main(String[] args) {
        int temp;
        int a[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(int i=0; i<10; i++)
            for(int j=0; j<9-i; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] =a[j+1];
                    a[j+1] =temp;
                }
            }
        System.out.println(Arrays.toString(a));
    ;


}

}
