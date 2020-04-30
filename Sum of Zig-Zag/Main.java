#include<iostream>
using namespace std;
int main()
{
  int r, c, r1sum = 0, r2sum = 0, d_sum = 0;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0; i < r; i++)
    for(int j = 0; j < c; j++)
      cin >> arr[i][j];
  
  for(int j = 0; j < c; j++)
    r1sum += arr[0][j];
  
  for(int j = 0; j < c; j++)
    r2sum += arr[c-1][j];
  
  for(int i = 0; i < r; i++) {
    for(int j = 0; j < c; j++) {
      if (i + j == r-1)
        d_sum += arr[i][j];
      if(i == 0 && j == c-1)
        d_sum -= arr[i][j];
      if(i == r-1 && j == 0)
        d_sum -= arr[i][j];
    }
  }
  cout << "Sum of Zig-Zag pattern is " << r1sum + r2sum + d_sum;
  return 0;
}