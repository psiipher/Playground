#include<iostream>
using namespace std;

int main() {
  int n, i, j;
  cin >> n;
  int a[n][n];
  int count = 1;
  
  for(i = 0; i < n ; i++) {
	for(j = 0; j <= i; j++){
		a[i][j] = count;
      	count ++;
      }
    }
  for (int i = 0; i < n; i++) {
    if(i % 2 == 0) {
      for (int j = 0; j <= i; j++) {
        if(i == j)
          cout << a[i][j];
        else
          cout << a[i][j] << "*";
      }
    }
    else {
      for(int j = i; j >= 0; j--) {
        if(i != j)
          cout << "*" << a[i][j];
        else
          cout << a[i][j];
      }
    }
    cout << endl;
  }
        
  
  return 0;
}