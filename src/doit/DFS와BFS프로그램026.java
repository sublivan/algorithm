package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [너비우선탐색]
 * boj 1260
 *
 * DFS와 BFS로 탐색한 결과를 출력하라
 * 방문할 수 있는 노드가 여러 개일 경우에는 노드 번호가 작은 것을 먼저 방문하라
 * 
 * 입력
 * - 노드의 개수 N, 에지의 개수 M, 탐색을 시작할 노드의 번호 V
 * - M개의 줄에는 연결되는 두개의 노드 값
 */
public class DFS와BFS프로그램026 {
	private static boolean[] visited;
	private static List<Integer>[] A;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[N + 1];
		
		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			A[x].add(y);
			A[y].add(x);
		}
		
//		for(List<Integer> list : A) {
//			System.out.println(list);
//		}
		
		for (int i = 1; i < N + 1; i++) {
			Collections.sort(A[i]);
		}
		
		visited = new boolean[N + 1];
		System.out.println("DFS");
		dfs(V);
		
		visited = new boolean[N + 1];
		System.out.println("\nBFS");
		bfs(V);
	}
	
	/**
	 * 깊이우선탐색 DFS; 재귀 활용
	 * @param node | 현재노드
	 */
	private static void dfs(int node) {
		if (visited[node])
			return;
		System.out.print(node + " ");
		visited[node] = true;
		
		for (int next : A[node]) {
			if (!visited[next]) {
				dfs(next);
			}
		}
	}

	/**
	 * 너비우선탐색 BFS; Queue활용
	 * @param node | 현재노드
	 */
	private static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(node);
		visited[node] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();	
			System.out.print(now + " ");
			
			for (int next : A[now]) {
				if (!visited[next]) {
					visited[next] = true;
					queue.add(next);
				}
			}
		};
	}

}
