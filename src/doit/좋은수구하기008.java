package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좋은 수 :주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수
 * N개의 수중 좋은 수가 총 몇개인지 구하라
 * 입력
 * - 수의 개수 N
 * - N개의 수의 값
 */
public class 좋은수구하기008 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long[] nums = new long[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(nums);
		int result = 0;
		for (long find : nums) { // 모든 수 순회
			int i = 0;
			int j = N-1;
			
			while (i < j) {
				long sum = nums[i] + nums[j];
				
				if (find == sum) {
					if (nums[i] != find && nums[j] != find) {
						result++;
						break;
					} else if (find < sum) {
						j--;
					} else if (find > sum) {
						i++;
					} 
				} if (find < sum) {
					j--;
				} else {
					i++;
				}  
			}
		}
		System.out.println(result);
		
		br.close();
	}

}
