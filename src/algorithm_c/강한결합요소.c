#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>
#define MAX 10001

using namespace std;

int id, d[MAX]; //각 노드마다 고유의 번호 할당위해  
bool finished[MAX]; // 특정한 노드에대한 dfs 가 끝낫는지 확인 
vector<int> a[MAX]; //인접노드 담는 배열 
vector<vector<int> > SCC; //한 그래프에 여러개 나올수 있기 때문에 2차원배열로 생성  
stack<int> s; //scc를 활용하기위해 


//DFS 는 총 정점의 갯수만큼 실행됩니다  
int dfs(int x){
	//노드마다 고유한 번호를 할당 
	d[x] = ++id;
	//스택에 자기 자신을 삽입  
	s.push(x);
	
	int parent = d[x]; 
	
	for(int i =0; i< a[x].size(); i++){
		int y= a[x][i]; 
		//방문하지않은이웃 
		if(d[y] == 0) parent = min(parent,dfs(y)); 
		//처리중인 이웃  
		else if(!finished[y]) parent =min(parent, d[y]);
	}
	
	//부모노드가 자기 자신인 경우  
	if(parent == d[x]){
		vector<int> scc;
		while(1){
			int t= s.top();
			s.pop();
			scc.push_back(t);
			finished[t]= true;
			if( t == x) break;
		}
		SCC.push_back(scc); 
	} 
	//자신의 부모값을 반환  
	return parent;
}



int main(void){
	int v =11; // 정점의 개수
	a[1].push_back(2);
	a[2].push_back(3);
	a[3].push_back(1);
	a[4].push_back(2);
	a[4].push_back(5);
	a[5].push_back(7);
	a[6].push_back(5);
	a[7].push_back(6);
	a[8].push_back(5);
	a[8].push_back(9);
	a[9].push_back(10);
	a[10].push_back(11);
	a[11].push_back(3);
	a[11].push_back(8);
	
	for(int i=1; i<=v; i++){
		if(d[i] == 0) dfs(i);
	}
	
	printf("SCC 의 개수: %d\n",SCC.size());
	for(int i =0; i<SCC.size(); i++){
		printf("%d 번째 scc: ",i+1);
		
		for(int j=0;j<SCC[i].size(); j++){
			printf("%d ", SCC[i][j]);
		}
		printf("\n");
	}
	
	return 0;
} 











