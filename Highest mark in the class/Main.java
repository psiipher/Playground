#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int size;
  cin >> size;
  int arr[size];
  int max = 0;
  for (int i = 0; i < size; i++){
    cin >> arr[i];
    if (arr[i] > max)
      max = arr[i];
  }
    cout << max;
}