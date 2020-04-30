#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, even = 0, odd = 0;
  cin >> n;
  int *arr = new int[n];
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  for (int i = 0; i < n; i++) {
    if (arr[i] % 2 == 0)
      even ++;
    else
      odd ++;
  }
  delete[] arr;
  cout << odd << endl;
  cout << even;
  return 0;
}