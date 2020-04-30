#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, f = 0, b = 0;
  cin >> n;
  int arr[n][n];
  for (int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
      cin >> arr[i][j];
      if (i == j)
        f += arr[i][j];
      if(i+j == n-1)
        b += arr[i][j];
    }
  }
  
  if(f == b)
    cout << "Yes";
  else
    cout << "No";
  return 0;
  
  
}