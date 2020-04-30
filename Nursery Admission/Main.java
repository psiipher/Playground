#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char name[100];
  cin >> name;
  int l = strlen(name);
  cout << "The number of letters in the name is " << l;
  return 0;
}