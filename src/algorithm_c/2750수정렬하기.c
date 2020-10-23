#include <stdio.h>

int a[1001];

int main(void){
	
	int num, i ,j, temp, index;
	
	scanf("%d", &num);
	
	for(i=0;i<num;i++){
		scanf("%d", &a[i]);
	}
	
	for(i=0;i<num;i++){
		int min=1001;
		for(j=i;j<num;j++){
			if(min > a[j]){
				min=a[j];
				index=j;
			}
		}
		temp=a[i];
		a[i]=a[index];
		a[index]=temp;
	}
	for(i=0;i<num;i++){
		printf("%d\n",a[i]);
	}
	
} 
