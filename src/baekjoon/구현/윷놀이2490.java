package baekjoon.구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 윷놀이2490 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //모 E, 도 A, 개 B, 걸 C, 윷 D
        String[] yutPlayRule = {"E", "A", "B", "C", "D"};

        for(int i = 0; i < 3; i++) {
            int zeroCnt = 0;
            String[] throwYut = br.readLine().split(" ");

            for (String yut : throwYut) {
                if (yut.equals("0")) {
                    zeroCnt++;
                }
            }

            System.out.println(yutPlayRule[zeroCnt]);
        }
        br.close();
    }
}
/**
 * 배(O) 등 (1)
 * 도 A 배1 등3
 * 개 B 배2 등2
 * 걸 C 배3 등1
 * 윷 D 배4 등0
 * 모 E 배0 등4
 */



