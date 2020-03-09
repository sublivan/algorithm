package 안경잡이개발자.정렬;

import java.util.Arrays;

//o(n*logn)
public class 퀵정렬 {
    static void quickSort(int[] data,int start,int end ){
        if(start>=end)
            return;
        int key=start; //키는 첫번째 원소
        int i = start +1;
        int j = end;
        int temp;

        while(i<=j){
            while(i <= end && data[i] <= data[key])
                i++;
            while(j > start && data[j] >= data[key])
                j--;
            if(i>j){//엇갈린상태
                temp = data[j];
                data[j]=data[key];
                data[key] = temp;
            }
            else{
                temp=data[i];
                data[i]=data[j];
                data[j]=temp;
            }
        }
        quickSort(data, start,j-1);
        quickSort(data,j+1,end );

    }
    public static void main(String[] args) {
        int data[] ={1,10,5,8,7,6,4,3,2,9};
        int num =10;

        quickSort(data,0,num-1);
        System.out.println(Arrays.toString(data));
    }
}
