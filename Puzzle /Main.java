#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r, c;
  cin >> r >> c;
  int arr[r][c], brr[c][r];
  for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
      cin >> arr[i][j];
    }
  }
  for (int i = 0; i < c; i++)
    for (int j = 0; j < r; j++)
      brr[i][j] = arr[j][i];
  
  for (int i = 0; i < c; i++) {
    for (int j = 0; j < r; j++) {
      cout << brr[i][j] << " ";
    }
    cout << "\n";
  }
 
  
  
}