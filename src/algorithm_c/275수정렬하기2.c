#include <stdio.h>

int data[1000001];
int num; 
void quickSort(int* data, int start,int end ){
	int temp;
	
	if(start>end){
		return;
	}
	int key= start;
	int i=start+1;
	int j=end;
	
	while(i<=j){
		while(data[i] <= data[key]){
			i++;
		}
		while(data[j] >= data[key] && j>start){
			j--;
		}
		if(i>j){
			temp=data[j];
			data[j]=data[key];
			data[key]=temp;
		}
		else{
			temp=data[i];
			data[i]=data[j]; 
			data[j]=temp;
		}
	}
	quickSort(data,start,j-1);
	quickSort(data,j+1,end);
}
int main(void){
	scanf("%d",&num);
	for(int i=0;i<num;i++){
		scanf("%d",&data[i]);
	}
	
	quickSort(data,0,num-1);
	
	for(int i=0;i<num;++i){
		printf("%d\n",data[i]);
	}
	return 0;
}

