package inflearn.코드구현력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 카드게임 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int aWin = 0;
        int bWin = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                aWin++;
                bWin++;
            } else if (A[i] > B[i]) {
                aWin += 3;
            } else {
                bWin += 3;
            }
        }
        String result;
        int lastIndex = A.length-1;
        if (aWin == bWin) {
            if (A[lastIndex] == B[lastIndex]) {
                result = "D";
            } else if (A[lastIndex] > B[lastIndex]) {
                result = "A";
            } else {
                result = "B";
            }
        } else {
            result = aWin > bWin ? "A" : "B";
        }
        System.out.println(aWin + " " + bWin);
        System.out.println(result);
    }
}
