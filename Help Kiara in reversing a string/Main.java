#include <algorithm> 
#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  std::getline( std::cin, str, '\n' );
  reverse(str.begin(), str.end());
  cout << str;
  return 0;
}
  