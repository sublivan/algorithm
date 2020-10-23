package programmers.정렬;

import java.util.*;

public class h_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));
    }
    public static int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        for(int i = 0; i < citations.length;  i++)
        {
            int h = citations[i]; //논문의 인용된 횟수
            int k = citations.length - i; //인용된 논문 편수
            if(k <= h)
            {
                answer = k;
                break;
            }
        }
        return answer;
    }
}
/*/
인용된 논문 편수k가 인용된 횟수 h보다 같거나 작을때 통과

원소 값은 점점 감소하고, 원소 값 이상인 것의 개수는 점점 감소하므로...
이 두 값의 최소값의 변화가 증가하다가 감소하는 지점을 찾으면...
 */
