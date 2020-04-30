#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char  c[100], ans[100];
  cin >> c >> ans;
  int res = strcmp(c, ans); 
      
  if (res==0) 
    cout << "It is correct"; 
  else
    cout << "It is wrong";
  
  return 0;
    
}