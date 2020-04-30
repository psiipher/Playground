#include<iostream>
#include<string>
#include<algorithm>
#include <bits/stdc++.h> 
using namespace std;
int main()
{
  //Type your code here.
  string str, rev;
  cin >> str >> rev;
  reverse(str.begin(), str.end());
  int l = str.compare(rev);
  if (l == 0)
    cout << "It is correct";
  else
    cout << "It is wrong";
  return 0;
}