#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c;
  cin >> r >> c;
  int arr[r][c], brr[r][c];
  for(int i = 0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin >> arr[i][j];
  for(int i = 0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin >> brr[i][j];
  
  for(int i = 0; i < r; i++) {
    for(int j = 0; j < c; j++) {
      cout << arr[i][j] + brr[i][j] << " ";
    }
    cout << "\n";
  }
  return 0;
}