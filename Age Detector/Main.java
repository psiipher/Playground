#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by, cy;
  cin >> by;
  cin >> cy;
  
  if (by < cy)
    cout << cy - by;
  else
    cout << ((100 - by) + cy);
  return 0;
}