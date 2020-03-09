package 안경잡이개발자;

import java.util.Scanner;

//백준 2752
/*
동규는 세수를 하다가 정렬이 하고싶어졌다.
숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.
숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
 */
public class 세숫자정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,temp,index=0;
        int a[]=new int[3];

        for(i=0;i<3;i++){
            a[i]=sc.nextInt();
        }

        for(i=0;i<3;i++){
            int min=1000001;
            for(j=i;j<3;j++){
                if(a[j]<min){
                    min=a[j];
                    index=j;
                }
            }
            temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        for(i=0;i<3;i++){
            System.out.print(a[i]+" ");
        }
    }
}
