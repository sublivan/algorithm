package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알람시계2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());

        System.out.println(changeTime(hour, min));
    }

    private static String changeTime(int hour, int min) {
        int changeHour = hour;
        int changeMin = min;
        if (min < 45) {
            changeHour -= 1;
            changeMin = 60 - (45 - changeMin);

            if (changeHour < 0) {
                changeHour += 24;
            }
        } else {
            changeMin -= 45;
        }
        return changeHour + " " + changeMin;
    }
}

/**
 * 1. 분이 45보다 작을때
 * 2. 분이 45보다 클때
 */