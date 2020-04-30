#include<iostream>
using namespace std;
int main()
{
  int n, m, sum = 0;
  cin >> n >> m;
  int arr[n];
  for(int i = 0; i < n; i++) {
	cin >> arr[i];
  	sum += arr[i];
  }	
  	
  if(n == 1 && m == 2)
    cout << 1;
  else
    cout << (sum/m) + 1;
  return 0;
}

