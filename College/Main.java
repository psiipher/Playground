#include<iostream>
#include <bits/stdc++.h>
using namespace std;

struct College {
  char name[100], city[100];
  int establishmentYear;
  float passPercentage;
};

bool compare(College a, College b)
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
  College c[10];
  cout << "Enter the number of colleges" << endl;
  cin >> n;
  for(int i = 0; i < n; i++) {
    cout << "Enter the details of college " << i+1 << endl;
    cout << "Enter name" << endl;
  	cin >> c[i].name;
    cout << "Enter city" << endl;
    cin >> c[i].city;
    cout << "Enter year of establishment" << endl;
    cin >> c[i].establishmentYear;
    cout << "Enter pass percentage" << endl;
    cin >> c[i].passPercentage;
  }
  //sort(c,c+n,compare);
  
  cout << "Details of colleges" << endl;
   for(int i = 0; i < n; i++) {
    cout << "College:" << i+1 << endl;
    cout << "Name:" << c[i].name << endl;
    cout << "City:" << c[i].city << endl;
    cout << "Year of establishment:" << c[i].establishmentYear << endl;
    cout << "Pass percentage:" << c[i].passPercentage << endl;
  }
  return 0;
}