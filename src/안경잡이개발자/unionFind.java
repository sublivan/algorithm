package 안경잡이개발자;

//합집합 찾기

public class unionFind {

    static int getParent(int[] parent, int x){
        if(parent[x] == x) return x;
        return parent[x] = getParent(parent, parent[x]);

    }
    static void unionParent(int[] parent, int a, int b){
        a=getParent(parent,a);
        b=getParent(parent,b);
        if(a<b) parent[b]=a;
        else  parent[a]=b;
    }
    static int findParent(int[] parent, int a, int b){
        a= getParent(parent, a);
        b=getParent(parent,b);
        if(a==b) return 1;
        else return 0;
    }

    public static void main(String[] arg){
        int[] parent=new int[11];
        for(int i=0;i<11;i++){
            parent[i]=i;
        }

        unionParent(parent,1,2);
        unionParent(parent,2,3);
        unionParent(parent,3,4);
        unionParent(parent,5,6);
        unionParent(parent,6,7);
        unionParent(parent,7,8);

        System.out.println("1과 5는 연결되어 있나요?"+findParent(parent,1,5));
        unionParent(parent,1,5);
        System.out.println("1과 5는 연결되어 있나요?"+findParent(parent,1,5));




    }



}
