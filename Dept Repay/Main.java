#include<iostream>
#include <iomanip>
#include <sstream>
//#include<bits/stdc++.h>

using namespace std;
int main()
{
  //Type your code here.
  int p, r, n;
  cin >> p >> r >> n;
  
  float i = p * r * n / 100;
  float a = i + p;
  float d = i * 0.02;
  double s = a - d;

  cout << i << endl;
  cout << a << endl;
  cout << d << endl;
  cout << s;

  return 0;  
}