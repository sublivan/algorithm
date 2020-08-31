package programmers.스택_큐;

import java.util.*;

public class 다리를지나는트럭 {
    public static void main(String[] args)
    {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4 ,5 , 6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> que = new LinkedList<Integer>();
        int cnt = 0;
        int sum = 0;
        for(int truck : truck_weights)
        {
            while(true) {
                //다리를 지나가는 트럭이 없을 경우
                if (que.isEmpty()) {
                        que.add(truck);
                        sum += truck;
                        answer++;
                        break;
                }
                //다리위에 올라간 트럭이 가득찬경우
                else if (que.size() == bridge_length) {
                    sum -= que.poll();
                }
                // 공간은 있지만 다리가 버틸 무게가 아닐경우
                // 다리위에 트럭이 지나갈 수 있는경우
                else {
                    if (sum + truck > weight)
                    {
                        answer++;
                        que.add(0);
                    }
                    else
                    {
                        que.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                }
            }
        }
        // 다리길이만큼 들어가고 나오기때문에 다리길이를 더해준다
        return answer + bridge_length;
    }
}
