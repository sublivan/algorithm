package 알고리즘;

/*
플로이드와샬 알고리즘
- 모든 정점에서 모든정점으로의 최단경로를 구하고 싶을댄 플로이드 와샬 알고리즘 사용
    cf) 다익스트라알고리즘은 하나의 정점에서 출발했을때 다른 정점으로의 최단경로 구하는 알고리즘

- '거쳐가는 정점'을 기준으로 알고리즘 수행
    cf) 다익스트라 알고리즘은 가장 적은 비용을 하나씩 선택
 */
public class 플로이드와샬 {
    static int num = 4;
    static int INF = 10000000;

    static int[][] a ={
            {0,5,INF,8},
            {7,0,9,INF},
            {2,INF,0,4},
            {INF,INF,3,0},
    };

    public static void main(String[] args) {
        floydWarshall();
    }
    static void floydWarshall(){
        //결과 그래프 생성
        int[][] d=new int[num][num];

        //결과 그래프 초기화
        for(int i=0; i< num; i++){
            for(int j=0; j<num; j++){
                d[i][j] = a[i][j];
            }
        }

        //k 거쳐가는 노드
        for(int k=0; k<num; k++){
            //i 출발 노드
            for(int i=0; i<num; i++){
                //j 도착노드
                for(int j=0; j<num; j++){
                    //출발-거쳐 + 거쳐-도착 < 출발-도착
                    if(d[i][k] + d[k][j] < d[i][j]){
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print(d[i][j]+"  ");
            }
            System.out.println("");
        }

    }

}
