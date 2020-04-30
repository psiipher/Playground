#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, c = 1;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  cout << 1 << endl;
  for (int i = 0; i < n-1; i++) {
    if (arr[i] > arr[i+1])
      cout << 1 << endl;
    else {
      cout << 2 * c << endl;
      c++;
    }
  }
  return 0;
}