#include<iostream>
#include <bits/stdc++.h>
using namespace std;

struct Student {
  char name[30];
  char department[20];
  int yearOfStudy;
  float cgpa;
};

bool compare(Student a, Student b)
{
	if(a.name < b.name)		
		return 1;
	else
		return 0;
}
int main()
{
  //Type your code here.
  int n;
  Student s[10];
  cout << "Enter the number of students" << endl;
  cin >> n;
  for(int i = 0; i < n; i++) {
    cout << "Enter the details of student " << i+1 << endl;
    cout << "Enter name" << endl;
  	cin >> s[i].name;
    cout << "Enter department" << endl;
    cin >> s[i].department;
    cout << "Enter year of study" << endl;
    cin >> s[i].yearOfStudy;
    cout << "Enter cgpa" << endl;
    cin >> s[i].cgpa;
  }
  sort(s,s+n,compare);
  
  cout << "Details of students" << endl;
   for(int i = 0; i < n; i++) {
    cout << "Student " << i+1 << endl;
    cout << "Name:" << s[i].name << endl;
    cout << "Department:" << s[i].department << endl;
    cout << "Year of study:" << s[i].yearOfStudy << endl;
    cout << "CGPA:" << s[i].cgpa << endl;
  }
  return 0;
}