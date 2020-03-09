package 안경잡이개발자.정렬;
//O(N^2)
import java.util.Arrays;

public class 선택정렬 {
    public static void main(String[] args) {

        int temp, min, index = 0;
        int a[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (int i = 0; i < 10; i++) {
            {
                min = 9999;
                for (int j = i; j < 10; j++) {
                    if (min > a[j]) {
                        min = a[j];
                        index = j;
                    }
                }
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
