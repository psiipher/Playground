#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, r_max;
  cin >> r >> c;
  int arr[r][c];
  for(int i = 0; i < r; i++) {
    r_max = 0;
    for(int j = 0; j < c; j++) {
      cin >> arr[i][j];
      if(arr[i][j] > r_max)
        r_max = arr[i][j];
    }
    cout << r_max << endl;
  }
  return 0;
      
}