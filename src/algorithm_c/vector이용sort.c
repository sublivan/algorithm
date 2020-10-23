#include <algorithm>
#include <iostream>

using namespace std; 

class Student{
	
	public:
		string name;
		int score;
		
		Student(string name,int score){
			this->name =name;#include <algorithm>
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
	v.push_back(pair<string, pair<int, int> > ("김민",make_pair(90,1995)));
	v.push_back(pair<string, pair<int, int> > ("민김",make_pair(56,1999)));
	v.push_back(pair<string, pair<int, int> > ("섭민",make_pair(79,1994)));
	v.push_back(pair<string, pair<int, int> > ("민섭",make_pair(79,1996)));
	
	sort(v.begin(), v.end(),compare);
	
	for(int i=0;i<v.size();i++){
		cout << v[i].first << ' ';
	}	
	
	return 0;
}


			this->score =score;
		}
		
		//정렬기준: 점수가 작은 순서(오름차순) 
		bool operator < (Student &student){
			return this->score > student.score;
		}
};

int main(void){
	Student students[]={
		Student("김",95),
		Student("이",84),
		Student("박",86),
		Student("명",75) 
		
	};
	sort(students, students+4);
	for(int i=0;i<4;i++){
		cout << students[i].name << ' ';
	}
} K