#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, max = 0;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0; i < r; i++) {
    for(int j = 0; j < c; j++) {
      cin >> arr[i][j];
      if(arr[i][j] > max)
        max = arr[i][j];
    }
  }
  cout << "The maximum element is " << max;
  return  0;
}