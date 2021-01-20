package programmers.그리디_탐욕법;

public class 조이스틱 {
    public static void main(String[] args) {
        조이스틱 main = new 조이스틱();
        String[] inputs = {"JEROEN", "JAN", "BBBBAAAAABBB"};

        for (String input : inputs) {
            System.out.println(input);
            System.out.println("결과값: " + main.solution(input) + "\n");
        }
        System.out.println("=======");
        System.out.println("기대값: 56 " + "기대값: 23 " + "기대값: 16 ");

    }

    public int solution(String name) {
        int upDownCnt = 0;

        // 위 아래 최소이동
        for (char now : name.toCharArray()) {
            int upMove = now - 'A';
            int downMove =  'Z' - now + 1; // A에서 Z로 이동해야하므로 +1
            upDownCnt += Math.min(upMove, downMove);
        }

        // A가 연속으로 등장했을때, 뒤돌아 가서 최솟값을 구한다.
        // A가 아닌 모든 문자를 돌릴 수 있는 최소 좌우 이동
        // 모든 위치에서 역으로 돌아가는 경우의 최소를 찾는다.
        int minMoveCnt = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
<<<<<<< HEAD
                int next = i +  1;
                if (next < name.length() && name.charAt(next) == 'A') {
                    next++;
=======
                int nextIdx = i + 1;
                while (nextIdx < name.length() && name.charAt(nextIdx) == 'A') {
                    nextIdx++;
>>>>>>> d1c50d5939dd3914bd91637ac8d89ec3e431969e
                }
                int move = 2 * i + name.length() - nextIdx;
                minMoveCnt = Math.min(move, minMoveCnt);
            }
        }
        return upDownCnt + minMoveCnt;
    }
}

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z  25개

JEROEN  - 6

0 1 2 3 4 5

minMove = 5

----
AAAAAAAAAAAA
BBBBAAAAABBB일 때 A의 위치를 찾고나서 A의 갯수를 세게되는 타이밍이 i = 4 이고
A의 갯수 = 5, 문자열 총길이 = 12 이다.

앞의 B 4개를 오른쪽으로갔다 왼쪽으로가는 왕복횟수를 계산하면 i * 2 이다.
next는 가장 마지막 B의 위치 index 이다.

i = 4는 A의 인덱스니까 실제로는 커서를 움직이지 않을 위치

그리고 나머지 A 다섯개 다음에 위치한 B 세개는 3번 움직여야한다.
이는 문자열 길이(12) - 왼쪽에서 찾은 B중 가장 마지막 B의 인덱스 next(4) - A의 갯수(5) 라고 보면 된다.

그렇기 때문에 횡이동 수의 식은 : 2 * i + name.length - next
 */