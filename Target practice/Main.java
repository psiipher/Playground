#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target;
  cin >> target;
  int x = 0;
  int sum = 0, count = 0;
  while(sum < target) {
    cin >> x;
    count ++;
    sum += x;
  }
  cout << "The number of turns is " << count;
}