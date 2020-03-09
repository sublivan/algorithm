#include <stdio.h>

int n,input;
int a[10001];

int main(void){
	scanf("%d",&n);
	
	for(int i=0;i<n;i++){
		scanf("%d",&input);
		a[input]++;		
	}
	for(int i=0;i<10001;++i){
		while(a[i] !=0){
			printf("%d\n",i);
			a[i]--; 
		}
	}
	
}

