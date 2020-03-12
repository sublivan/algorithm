#include <iostream>

#include <vector>

using namespace std;

/*
10개의 원소를 입력받고 입력받은값 정렬하기
정렬 과정이 출력되야된다
하향식으로 구현  
*/

int number;
int heap[1000001];

void heapify(int i){
	//왼쪽자식노드 가리킴  
	int c =2*i+1;
	//오른쪽 자식 노드가 있고, 왼쪽 자식노드보다 크다면  
	if(c < number && heap[c] <heap[c+1]){
		c++;
	}
	//부모보다 자식이 크다면 교환 
	if(heap[i]<heap[c]){
		int temp=heap[i];
		heap[i]=heap[c];
		heap[c]=temp;
	}
	//number/2 만큼만 수행하면됨 
	if(c<=number/2) heapify(c);
}
int main(void){
	cin >> number;
	for(int i=0;i<number;i++){
		cin >>heap[i];
	}
	//힙을 생성한다 
	for(int i=number/2;i>=0;i--){
		heapify(i);
	}
	//정렬을 수행한다  
	for(int i=number-1;i>=0;i--){
		for(int j=0;j<number;j++){
			cout << heap[j] << ' ';
		}
		cout << '\n';
		int temp=heap[0];
		heap[0]=heap[i];
		heap[i]=temp;
		int root=0;
		int c=1;
		
		do{
			c=2*root+1;
			//자식중에 더큰 값 찾기  
			if(c < i-1 && heap[c] < heap[c+1]){
				c++;
			}
			//부모보다 크다면 교환  
			if(c<i && heap[root] < heap[c]){ 
				temp=heap[root];
				heap[root]=heap[c];
				heap[c]=root;		
			}
			root=c;
		
		}while(c<i);
	
	}
	
}
