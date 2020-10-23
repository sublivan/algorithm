package programmers.월간코드챌린지시즌1;

import java.util.Arrays;

public class 프로그래밍2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4)));
    }

    private static int length(int n)//높이에 따른 원소의 갯수구하는 메소드
    {
        if(n == 1)
            return 1;
        return n + length(n - 1);
    }

    public static int[] solution(int n) {
        int[] answer;
        int ln = length(n);//높이에 따른 원소의 갯수

        int arr[][] = new int[n][n];
        int x = -1, y = 0; //arr[0][0]에 넣기위해 x값 -1 y값 0 초기화
        int num = 1; //시작수
        for(int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {// 대각선, 밑변, 높이 순서대로 이동하는 규칙을 활용
                if (i % 3 == 0) { //x증가를 통한 좌측 대각선 이동
                    x++;
                } else if (i % 3 == 1) { // y증가를 통한 밑변에서의 이동
                    y++;
                }
                else if (i % 3 == 2) { //x 감소를 통한 높이에서의 이동, y감소를통한 밑변에서의 이동
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }
        int index = 0;
        answer = new int[ln];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; ++j) {
                answer[index++] = arr[i][j]; // 대각선 기준 좌하단만 넣기
            }
        }
        return answer;
    }
}
/*
(통과)
문제
정수 n이 매개변수로 주어집니다.
다음 그림과 같이 밑변의 길이와 높이가 n인 삼각형에서 맨 위 꼭짓점부터 반시계 방향으로 달팽이 채우기를 진행한 후,
첫 행부터 마지막 행까지 모두 순서대로 합친 새로운 배열을 return 하도록 solution 함수를 완성해주세요.

n	result
4	[1,2,9,3,10,8,4,5,6,7]
5	[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
6	[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
 */
/*
비슷한 유형의 문제
http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=609&sca=20
 */