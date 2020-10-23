package Greedy;

/*
잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때,
받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int n,result=0;
        n =Integer.parseInt(br.readLine());
        if(n<1000) {
            result=0;
            n = 1000 - n;
            result += n / 500;
            n %= 500;

            result += n / 100;
            n %= 100;

            result += n / 50;
            n %= 50;

            result += n / 10;
            n %= 10;

            result += n / 5;
            n %= 5;

            result += n;
            System.out.println(result);

        }
    }
}
