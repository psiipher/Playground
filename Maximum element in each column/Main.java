#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c , max = 0;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin >> arr[i][j];
  
  for(int j = 0; j < c; j++) {
    max = 0;
    for(int i = 0; i < r; i++) {
      if(arr[i][j] > max)
        max = arr[i][j];
    }
    cout << max << endl;
  }
  return 0;
}