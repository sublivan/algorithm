#include <algorithm>
#include <iostream>

using namespace std; 

class Student{
	
	public:
		string name;
		int score;
		
		Student(string name,int score){
			this->name =name;
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
} 