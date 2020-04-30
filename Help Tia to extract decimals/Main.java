#include<iostream>
#include<string.h>

using namespace std;
int main() 
{ 
	string str;
  cin >> str;
  int count = 0;
  for (int i = 0; i < str.size(); i++) {
    if (str[i] == '.')
      break;
    count ++;
  }
  cout << "Floating part is : ";
  for (int j = count + 1; j < str.size(); j++)
    cout << str[j];
}