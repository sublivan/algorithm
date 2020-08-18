package 정렬;

import java.util.*;

public  class 소트인사이트1427{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            nums[i] = Integer.parseInt(input[i]);
        }
        int[] result = sort(nums);
        for(int i : result)
            System.out.print(i);
    }
    private static int[] sort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length - i; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j +  1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] str = sc.next().split("");
//        Arrays.sort(str);
//        for(int i = str.length - 1; i >= 0; i--)
//            System.out.print(str[i]);
//    }
}
