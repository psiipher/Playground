#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n, m, f = 0;
  cin >> n;
  int arr[n];
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  cin >> m;
  for(int i = 0; i < n; i++) {
    if (arr[i] == m) {
      f = 1;
      break;
    }
  }
  if(f == 1)
    cout << "She passed her exam";
  else
    cout << "She failed";
  return 0;
}