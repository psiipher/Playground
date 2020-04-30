#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, r_sum;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0; i < r; i++) {
    r_sum = 0;
    for(int j = 0; j < c; j++) {
      cin >> arr[i][j];
      r_sum += arr[i][j];
    }
    cout << r_sum << endl;
  }
  return 0;
}