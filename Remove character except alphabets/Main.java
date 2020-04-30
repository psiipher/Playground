#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  cin >> s;
  int j = 0; 
  for (int i = 0; i < s.size(); i++) { 
    if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >='a' && s[i] <= 'z')) {  
      s[j] = s[i]; 
      j++; 
     }
    } 
    cout << s.substr(0, j); 
}