#include <stdio.h>
 
int a[3];

int main(void){
	int i,j,min,index,temp;
	
	for(i=0; i<3 ; i++){
		scanf("%d", &a[i]);
	}
	
	for(i=0;i<3; i++){
		min=1000001;
		for(j=i; j<3; j++){
			if(min > a[j]){
				min=a[j];
				index=j;
			}
		}
		temp =a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	
	for(i=0; i<3; i++){
		printf("%d ", a[i]);
	
	}
	return 0;
	
}
