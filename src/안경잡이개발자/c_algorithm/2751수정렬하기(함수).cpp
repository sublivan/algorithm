#include <stdio.h>
#include <algorithm>

int num, data[1000001];

int main(void){
	scanf("%d",&num);
	
	for(int i=0;i<num;i++){
		scanf("%d",&data[i]);
	}
	
	std::sort(data, data + num);
	
	for(int i=0;i<num;++i){
		printf("%d\n",data[i]);
	}
	
	return 0;
	
}
