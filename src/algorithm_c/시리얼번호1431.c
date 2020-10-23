#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
 
int num;
vector<string> v;

int getSum(string a){
	int n= a.length(), sum =0;
	for(int i=0;i<n;i++){
		if(a[i] -'0' <= 9 && a[i]-'0'>=0){
			sum +=a[i]-'0';
		}
	}
	return sum;
}

bool compare(string a, string b){
	if(a.length() == b.length()){
		int aSum=getSum(a);
		int bSum=getSum(b);
		
		if(aSum==bSum){
			return a<b;
		}
		else{
			return aSum < bSum;
		}
	}
	else{
		return a.length() < b.length();
	}
}
int main(void){
	cin >> num;
	string input;
	for(int i=0;i<num;i++){
		cin >> input;
		v.push_back(input);
	}
	
	sort(v.begin(),v.end(),compare);
	
	for(int i=0;i<num;i++){
		cout << v[i] << '\n';
	}
	return 0;
	
	
	
	
}
