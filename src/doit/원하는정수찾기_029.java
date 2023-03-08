package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [이진 탐색]
 *
 * N개의 정수 A[1], A[2] ... A[N]이 주어져있을때 이 안에서 X라는 정수가 존재하는지 알아내라
 * 입력
 * - 데이터 개수 N
 * - N개의 정수 모임
 * - 찾아야할 숫자 개수 M
 * - M개의 정수 모임
 * 출력
 * - 존재하면 1, 존재하지않으면 0
 */
public class 원하는정수찾기_029 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int find = Integer.parseInt(st.nextToken());
            if (binarySearch(nums, find)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    /**
     * @param arr 조회 대상
     * @param target 찾는 값
     * @return boolean 찾으면 true; 못찾으면 false
     */
    private static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
