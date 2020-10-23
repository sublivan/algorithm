#include <iostream>
#include <algorithm>
#include <stdio.h>
using namespace std;

int n;
string str[20000];

bool compare(string a, string b){
	if(a.length() < b.length()){
		return 1;
	}
	else if(a.length() > b.length()){
		return 0;
	}
	else{
		a<b;
	}
}
int main(void){
	
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		cin >> str[i];
	}
	sort(str, str+n,compare);
	
	for(int i=0;i<n;i++){
		if(i>0 && str[i]==str[i-1])continue;
		cout << str[i] << '\n';
	}
	return 0;
}
