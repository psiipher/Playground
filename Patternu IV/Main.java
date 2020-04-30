#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int count = 1;
  int n;
  cin >> n;
  int arr[n][n];
  for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
      if(j < n-1)
        arr[i][j] = count;
      else
        arr[i][j] = ++count;
    }
  }
  
  for(int i = 0; i < n; i++) {
    if (i % 2 == 0) {
      for(int j = 0; j < n; j++)
        cout << arr[i][j];
    }
    else {
      for(int j = n-1; j >= 0; j--)
        cout << arr[i][j];
    }
    cout << endl;
  }
      
    return 0;
}