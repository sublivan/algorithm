package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * 수 N개가 주어졌을때 i번째 수에서 j번째 수까지의 합을 구하라
 * 입력
 * - 첫번째줄: 수의 개수 N, 합을 구해야하는 횟수 M
 * - 두번째줄: N개의 수
 */
public class 구간합구하기003 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long[] sums = new long[N + 1];
		for (int i = 1; i <= N; i++) {
			sums[i] += sums[i-1] + Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Arrays.toString(sums));
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			System.out.println(sums[end] - sums[start-1]);
		}
	}
}

