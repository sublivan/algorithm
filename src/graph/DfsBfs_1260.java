package graph;

//인접리스트로 구현한 dfs, bfs
//dfs 재귀 사용
import java.io.*;
import java.util.*;

public class DfsBfs_1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] a =(ArrayList<Integer>[])new ArrayList[n+1]; //인접리스트사용
        boolean[] visit =new boolean[n+1];

        for(int i=0;i<=n;i++){
            a[i]= new ArrayList<>();
        }
        for(int i=0; i<m ; i++ ){
            st=new StringTokenizer(br.readLine());
            int v1= Integer.parseInt(st.nextToken());

            int v2= Integer.parseInt(st.nextToken());

            a[v1].add(v2);
            a[v2].add(v1);

        }
        for(int i=1;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println("\n");
        for(int i=1;i<n;i++){
            Collections.sort(a[i]);
        }
        dfs(a,visit,v);
        System.out.println("");
        Arrays.fill(visit,false);
        bfs(a,visit,v);
    }
    static void dfs(ArrayList<Integer>[] a, boolean[] c,int v){
        if(c[v]){
            return;
        }
        Stack<Integer> stack = new Stack<>();
        int n = a.length -1;

        stack.push(v);
        c[v]=true;
        System.out.print(v+" ");
        for(int x : a[v]){
            if(!c[x]){
                dfs(a,c,x);
            }
        }


    }

    static void bfs(ArrayList<Integer>[] a, boolean[] c,int v){
        Queue<Integer>  q =new LinkedList<>();

        q.add(v);
        c[v] =true;

        while(!q.isEmpty()){
            v=q.poll();
            System.out.print(v+" ");

            for(int vv: a[v]){
                if(!c[vv]){
                    q.add(vv);
                    c[vv] = true;
                }
            }
        }

    }
}
