package 안경잡이개발자;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
위상정렬(Topology Sort)
- 순서대로 작업했을때 끝까지 가는 것
- 사이클이 발생하지 않는 방향그래프이여야 한다; 사이클이 발생하면 위상정렬을 수행할수 없음

 */
public class 위상정렬 {
    public static int[][] graph;
    public static int[] inDegree;
    public static ArrayList<Integer> sortedGraph;

    public static void main(String[] args) {

    }

    public void bfs() {
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                inDegree[i]--; // 큐에 다시 넣지 않도록 확실히 -값으로 만들어버림
                sortedGraph.add(i);
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            // 큐에 있는 노드는 차수 0인노드, 따라서, 해당 노드가 없어졌다고 보고,
            // 해당 노드와 연결된 간선과, 연결된 노드의 차수를 줄여줌.
            int node = q.poll();

            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1) { // 연결된 노드면
                    graph[node][i] = 0; // 연결 제거
                    inDegree[i]--; // 연결된 노드의 차수 제거
                }

                if (inDegree[i] == 0) {
                    inDegree[i]--;
                    sortedGraph.add(i);
                    q.add(i);
                }
            }
        }
    }

    public void topologicalSortBFS() {
        // create indegree, 차수만들기
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 1) {
                    inDegree[j]++; // i -> j 로 가는 간선이 있다는 말은 j입장에서는 j에 대한 위상이 하나 존재한다는 뜻.
                }
            }
        }

        bfs();
    }
}
