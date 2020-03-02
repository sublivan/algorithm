package 백준.기초.자료구조1;

import java.util.*;

public class 스택 {

    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] =new int[n];
        int top=-1;
        String input;

        for(int i=0 ; i<n; i++){
            input =sc.next();

            if(input.equals("push")){
                ++top;
                arr[top] = sc.nextInt();

            }
            else if(input.equals("pop")){
                if(top == -1)
                  System.out.println(-1);
                else {
                    System.out.println(arr[top]);
                    --top;
                }
            }
            else if (input.equals("size")){
                System.out.println(top+1);
            }
            else if(input.equals("empty")){
                System.out.println(top == -1 ? 1:0);
            }
            else if(input.equals("top")){
                System.out.println(top == -1 ? -1 : arr[top]);
            }
        }
    }
}
