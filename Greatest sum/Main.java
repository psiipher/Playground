#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r, c, r_sum, c_sum, r_max = 0, c_max = 0;
  int ri, ci;
  cin >> r >> c;
  int arr[r][c];
  
  cout << "Sum of rows is ";
  for(int i = 0; i < r; i++) {
    r_sum = 0;
    for(int j = 0; j < c; j++) {
      cin >> arr[i][j];
      r_sum += arr[i][j];
    }
    if(r_sum > r_max) {
      ri = i + 1;
      r_max = r_sum;
    }
    cout << r_sum << " ";
  }
  cout << endl << "Row " << ri << " has maximum sum" << endl;
  
  cout << "Sum of columns is ";
  for(int j = 0; j < c; j++) {
    c_sum = 0;
    for(int i = 0; i < r; i++) {
      c_sum += arr[i][j];
    }
    if(c_sum > c_max) {
      ci = j + 1;
      c_max = c_sum;
    }
    cout << c_sum << " ";
  }
  cout << endl << "Column " << ci << " has maximum sum";
  
  return 0;
  
	
}