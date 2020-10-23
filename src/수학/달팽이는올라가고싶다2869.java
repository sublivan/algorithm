package 수학;

import java.io.*;
import java.util.*;

public class 달팽이는올라가고싶다2869
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());;
        int v = Integer.parseInt(st.nextToken());;
        int answer = 1;

        if((v - a) % (a - b) == 0)
        {
            answer += (v - a) / (a - b);
        }
        else
            answer += (v - a) / (a - b) + 1;
        System.out.println(answer);
    }
}

/*
마지막만 미끄러지지않기 때문에 하루에 가는 양은 (아침에 올라가는 A) - (밤에 미끄러지는 B) 이다.
그런데 마지막에는 A만 더해야 하므로 마지막 A를 전체 V에서 뺀다.
그럼 V-A가 된다. 여기서 A-B로 나누면 결국 마지막 날을 제외한 날들이 며칠 반복되어야 하는지 알 수 있다.
V에서 마지막 A가는 거리를 뺀 것이 하룻동안 이동한 거리로 딱 맞게 떨어진다면
V - A를 A - B로 나누어 이동한 총 일수를 계산
그렇지 않다면 1을 더한다.
 */