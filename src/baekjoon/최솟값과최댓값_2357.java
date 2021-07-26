package baekjoon;

// 세그먼트트리
import java.util.*;

public class 최솟값과최댓값_2357 {

    static int[] nums, minTree, maxTree;

    public static int minInit(int start, int end, int node) {
        if (start == end) {
            return minTree[node] = nums[start];
        }

        int mid = (start + end) / 2;
        // 왼쪽자식 2n, 오른쪽자식 2n + 1
        return minTree[node] = Math.min(minInit(start, mid, node * 2), minInit(mid + 1, end, node * 2 + 1));
    }

    public static int maxInit(int start, int end, int node) {
        if (start == end) {
            return maxTree[node] = nums[start];
        }

        int mid = (start + end) / 2;
        // 왼쪽자식 2n, 오른쪽자식 2n + 1
        return maxTree[node] = Math.max(maxInit(start, mid, node * 2), maxInit(mid + 1, end, node * 2 + 1));
    }

    // fromIndex ~ toIndex 범위 안에서 값 찾기
    public static int minFind(int start, int end, int node, int fromIndex, int toIndex) {
        if (toIndex < start || fromIndex > end) { // 범위를 벗어난 경우
            return Integer.MAX_VALUE;
        }

        if (fromIndex <= start && toIndex >= end) { // 범위 안에 있는 경우
            return minTree[node];
        }
        int mid = (start + end) / 2;
        return Math.min(minFind(start, mid, node * 2, fromIndex, toIndex), minFind(mid + 1, end, node * 2 + 1, fromIndex, toIndex));
    }

    public static int maxFind(int start, int end, int node, int fromIndex, int toIndex) {
        if (toIndex < start || fromIndex > end) { // 범위를 벗어난 경우
            return Integer.MIN_VALUE;
        }

        if (fromIndex <= start && toIndex >= end) { // 범위 안에 있는 경우
            return maxTree[node];
        }
        int mid = (start + end) / 2;
        return Math.max(maxFind(start, mid, node * 2, fromIndex, toIndex), maxFind(mid + 1, end, node * 2 + 1, fromIndex, toIndex));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }

        minTree = new int[n * 4];
        maxTree = new int[n * 4];

        minInit(1, n, 1);
        maxInit(1, n, 1);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int fromIndex = Integer.parseInt(sc.next());
            int toIndex = Integer.parseInt(sc.next());

            int minValue = minFind(1, n, 1, fromIndex, toIndex);
            int maxValue = maxFind(1, n, 1, fromIndex, toIndex);

            result.append(minValue + " " + maxValue + "\n");
        }
        System.out.println(result.toString());
    }
}

// 시간초과로 효율성에 만족하지 못한 코드
/**
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(sc.next()));
        }

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            solution(new ArrayList<>(nums.subList(a, b)));

        }
    }

    public static void solution(List<Integer> subList) {
        Collections.sort(subList);

        int min = subList.get(0);
        int max = subList.get(subList.size() - 1);

        System.out.println(min + " " + max);
    }
**/