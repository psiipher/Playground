#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s, sum = 0;
  cin >> n >> s;
  int arr[n];
  for (int i = 0; i < n; i++) {
    cin >> arr[i];
  	sum += arr[i];
  }

  if (sum > s)
    cout << "NO";
  else
    cout << "YES";
  return 0;
  
}