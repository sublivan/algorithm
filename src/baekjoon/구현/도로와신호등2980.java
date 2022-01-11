package baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 도로와신호등2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Map<Integer, TrafficLight> lightMap = new HashMap<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            int D = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            lightMap.put(D, new TrafficLight(R, G));
        }

        int position = 0;
        int timeCount = 0;

        while (position < L) {
            timeCount++;
            position++;

            if (lightMap.get(position) != null) {
                int redTime = lightMap.get(position).redTime;
                int greenTime = lightMap.get(position).greenTime;

                int stopOrGoTime = timeCount % (redTime + greenTime);

                if (stopOrGoTime <= redTime) {
                    timeCount += (redTime - stopOrGoTime);
                }
            }
        }
        System.out.print(timeCount);

    }

    static class TrafficLight {
        int redTime;
        int greenTime;

        public TrafficLight(int redTime, int greenTime) {
            this.redTime = redTime;
            this.greenTime = greenTime;
        }
    }
}



/**
 * 1초에 1미터씩 움직인다.
 * 신호등이 빨간색이면 멈추고 초록불이 될때까지 기다린다.
 * 트럭이 도로에 진입했을때 모든 신호등의 색상은 빨간색
 * 도로의 끝까지 이동하는데걸리는 시간을 구하라
 *
 * 도로의 시작은 0 끝은 L미터인 지점
 * N : 신호등의 개수
 * L : 도로의 길이
 * D : 신호등 위치
 * R : 빨간불 지속시간
 * G : 초록불 지속시간
 */