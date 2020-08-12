package 재귀;


import java.util.Scanner;

public class 팩토리얼10872 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int result=1;
        for(int i=2;i<=n;i++){
            result *=i;
        }
        System.out.println(result);


    }
}
