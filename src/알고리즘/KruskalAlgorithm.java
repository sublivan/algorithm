package 알고리즘;

//크루스칼 알고리즘
/*
가장 적은 비용으로 모든 노드를 연결하기 위해 사용하는 알고리즘
즉, 최소 신장트리를 만들기위한 대표적인 알고리즘

예, 여러개의 도시가 있을때 각 도시를 도로를 이용해 연결하고자 할때 비용을
최소한으로 하고자 할때 실제로 적용되는 알고리즘

 */
import java.util.*;

public class KruskalAlgorithm {
    //부모 노드를 가져옴
    static int getParent(int[] set,int x){
        if(set[x] == x) return x;
        return set[x]= getParent(set,set[x]);
    }

    //부모 노드를 병합
    static void unionParent(int[] set,int a,int b){
        a=getParent(set,a);
        b=getParent(set,b);

        //숫자가 더 작은 부모로 병합
        if(a<b) set[b]=a;
        else set[a]=b;

    }

    //같은 부모를 가지는지 확인
    static int find(int[] set,int a,int b){
        a=getParent(set,a);
        b=getParent(set,b);

        //같은 부모를 가지면
        if(a==b){
            return 1;
        }
        else return 0;

    }

    public static void main(String[] args) {
        int n=7;//정점 개수
        int m=11;//간선 개수

        ArrayList<Edge> edgeList=new ArrayList<>();
        edgeList.add(new Edge(1,7,12));
        edgeList.add(new Edge(1,4,28));
        edgeList.add(new Edge(1,2,67));
        edgeList.add(new Edge(1,5,17));
        edgeList.add(new Edge(2,4,24));
        edgeList.add(new Edge(2,5,62));
        edgeList.add(new Edge(3,5,20));
        edgeList.add(new Edge(3,6,37));
        edgeList.add(new Edge(4,7,13));
        edgeList.add(new Edge(5,6,45));
        edgeList.add(new Edge(5,7,73));


        //간선의 비용으로 오름차순 정렬
        Collections.sort(edgeList);


        for(int i=0;i<edgeList.size();i++){
            System.out.print("정렬확인 "+edgeList.get(i).distance+" ");
        }

        //각 정점이 포함된 그래프가 어디인지 저장
        int[] set=new int[n];

        for(int i=0;i<n;i++){
            set[i]=i;
        }

        //거리의 합을 0으로 초기화
        int sum=0;
        for(int i=0;i<edgeList.size();i++){
            //
            if(find(set,edgeList.get(i).node[0] - 1,edgeList.get(i).node[1]-1)==0){
                sum +=edgeList.get(i).distance;
                unionParent(set, edgeList.get(i).node[0]-1, edgeList.get(i).node[1]-1);
            }
        }
        System.out.println(sum);


    }
}


//간선클래스 선언
class Edge implements Comparable<Edge>{
    int[] node=new int[2];
    int distance;

    Edge(int a,int b,int distance){
        this.node[0]=a;
        this.node[1]=b;
        this.distance=distance;
    }



    @Override
    public int compareTo(Edge edge) {
       if(this.distance < edge.distance){
           return -1;
       }
       else if(this.distance == edge.distance)
           return 0;
       else
           return 1;
    }
}

