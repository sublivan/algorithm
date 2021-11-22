package programmers.level1;

public class 부족한금액계산하기 {

    //1)
    public long solution(int price, int money, int count) {
        long totalPrice = price;

        for (int N = 2; N <= count; N++) {
            totalPrice += price * N;
        }

        long lackOfMoney = money > totalPrice ? 0 : totalPrice - money;

        return lackOfMoney;
    }

    //2) 등차수열 활용 n(n + 1) / 2
}
