package programmers.level2;

public class 큰수만들기 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        char max;

        if (number.charAt(0) == '0'){
            return "0";
        }
        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = idx; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}

/*

number에서 k개의 수를 제거하는것은 number에서 number의 길이 - k 만큼의 문자열을 선택하는것과 같다.

i번째 숫자에서 선택할수 있는 숫자는 i + k까지 이다.

예를 들어 number = 1924 이고 k = 2 일때,

i = 0 번째에서 선택할 수 있는 숫자는 0 ~ 2(192)까지이다

왜냐하면 최종적으로 선택되는 문자의길이는 number.length() - 2 = 2 이므로,

문자선택 후 현시점에서 k개의 숫자를 버릴때 최종적으로 나와야하는 문자열의 길이의 문제가 없어야한다.(2를 고르면 24가 가능해야된다)

 */