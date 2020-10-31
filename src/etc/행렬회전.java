package etc;

/*
문제 : N X N 행렬이 있다.
추가적인 행렬을 사용하지 않고 90도 회전해라.
 */

public class 행렬회전 {
    public static void main(String[] args)
    {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] arr : input)
        {
            for (int i : arr)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int[] arr : solution(input))
        {
            for (int i : arr)
            {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

    }

    public static int[][] solution(int[][] matrix)
    {
        final int max = matrix.length - 1;
        //행 기준
        for (int i = 0; i < matrix.length / 2; i++)
        {
            //열을 기준으로 연산
            for (int j = i; j < matrix.length - 1 - i; j++)
            {
                int top = matrix[i][j];

                //왼쪽 위
                matrix[i][j] = matrix[max - j][i];
                //왼쪽 아래
                matrix[max - j][i] = matrix[max - i][max - j];
                //오른쪽 아래
                matrix[max - i][max - j] = matrix[j][max - i];
                //오른쪽 위(top)
                matrix[j][max - i] = top;
            }
        }
        return matrix;
    }
}


/*
참고:
https://hsdevelopment.tistory.com/298

회전에는 인덱스 활용이 중요하다

예를 들어,

7, 13 번 째 줄
→ [a][b] = [c][d]에서 b + c는 N - 1로 일정.(배열 시작을 0부터 시작할 경우) 그래서 b가 j 일 경우, c는 MAX - 1 - j이다.
그리고 a와 d는 같다.

8, 14 번 째 줄
→ [a][b] = [c][d]에서 b + c는 N - 1로 일정.(배열 시작을 0부터 시작할 경우) 그래서 b가 i 일 경우, c는 MAX - 1 - i이다.


1  [0][0] [0][1] [0][2] [0][3]
2  [1][0] [1][1] [1][2] [1][3]
3  [2][0] [2][1] [2][2] [2][3]
4  [3][0] [3][1] [3][2] [3][3]
5
6  Top = [0][0]
7  [0][0] = [3][0]
8  [3][0] = [3][3]
9  [3][3] = [0][3]
10 [0][3] = Top
11
12 Top = [0][1]
13 [0][1] = [2][0]
14 [2][0] = [3][2]
15 [3][2] = [1][3]
16 [1][3] = Top

.
.
.
 */
