#include <stdio.h>
//O(n)

int num=9;
int heap[9]={7,6,5,8,3,5,9,1,6};

int main(void){

	//전체 트리 구조를 최대힙으로 변경
	for(int i=1; i<num;i++){

		int c =i;

		do{
			int root=(c-1)/2;
			if(heap[root] < heap[c]){
				int temp =heap[root];
				heap[root] =heap[c];
				heap[c]=temp;
			}
			c=root;
		}while(c !=0);

	}

	//크기를 줄여가며 반복적으로 힙을 구성(오름차순)
	for (int i=num-1;i>=0;i--){
		//가장큰값을 맨뒤로 보내기
		int temp=heap[0];
		heap[0]=heap[i];
		heap[i]=temp;

		int root= 0;
		int c=1;

		do{
			c=2*root+1;
			//자식중에 더 큰값 찾기
			if(heap[c] < heap[c+1] && c<i-1){
				c++;
			}
			//부모(루트)보다 자식이 크다면 교환
			if(c<i && heap[root]<heap[c]){
				int temp =heap[root];
				heap[root] =heap[c];
				heap[c]=temp;
			}
			root= c;
		}while(c <i);
	}

	//결과출력
	for(int i=0;i<num;i++){
		printf("%d",heap[i]);
	}



}