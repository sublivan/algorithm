package 문자열;

        import java.util.Scanner;

public class 다이얼5622 {
    public static void main(String[] args) {
        int dial[] = {2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;

        for(int i = 0; i < str.length(); i++)
        {
            result += dial[str.charAt(i) - 65] + 1;
        }
        System.out.println(result);

    }
}
