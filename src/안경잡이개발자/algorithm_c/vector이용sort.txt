#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

bool compare(pair<string, pair<int,int> >a,
			pair<string, pair<int,int> >b){
	
	if(a.second.first == b.second.first) {
		return a.second.second > b.second.second;
	}
	else{
		return a.second.first > b.second.first;
	}								
					
}
int main(void){
	vector<pair<string, pair<int, int> > > v;
	v.push_back(pair<string, pair<int, int> > ("梯團",make_pair(90,1995)));
	v.push_back(pair<string, pair<int, int> > ("團梯",make_pair(56,1999)));
	v.push_back(pair<string, pair<int, int> > ("撥團",make_pair(79,1994)));
	v.push_back(pair<string, pair<int, int> > ("團撥",make_pair(79,1996)));
	
	sort(v.begin(), v.end(),compare);
	
	for(int i=0;i<v.size();i++){
		cout << v[i].first << ' ';
	}	
	
	return 0;
}

