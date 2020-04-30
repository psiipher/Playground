#include<iostream>
using namespace std;
struct employee {
  char name[100], desig[100];
  int age, id, salary;
};

int main()
{
  //Type your code here.
  employee e;
  cout << "Enter name:" << endl;
  cin >> e.name;
  cout << "Enter ID:" << endl;
  cin >> e.id;
  cout << "Enter age:" << endl;
  cin >> e.age;
  cout << "Enter designation:" << endl;
  cin >> e.desig;
  cout << "Enter Salary:" << endl;
  cin >> e.salary;
  
  cout << "Employee Details" << endl;
  cout << "Name of the Employee : " << e.name << endl;
  cout << "ID of the Employee : " << e.id << endl;
  cout << "Age of the Employee : " << e.age << endl;
  cout << "Designation of the Employee : " << e.desig << endl;
  cout << "Salary of the Employee : " << e.salary << endl;
  return 0;
}