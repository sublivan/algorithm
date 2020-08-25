package programmers;

//2019 카카오 개발자 겨울 인턴쉽
import java.util.*;
public class 크레인인형뽑기게임 {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    if(result.isEmpty()) {
                        result.push(board[j][moves[i] - 1]);
                    }
                    else{
                        if(board[j][moves[i] - 1] == result.peek())
                        {
                            result.pop();
                            answer += 2;
                        }
                        else
                        {
                            result.push(board[j][moves[i] - 1]);
                        }
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
