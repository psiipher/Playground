#include <iostream>
using namespace std;
int main()
{
  int n;
  cin >> n;
  int temp = 1, nc = n, nc2 = n;
  int sq = n*n;
  int sqc = sq+1;

  for(int i = 0; i < n; i++) {
    cout << i+1;
    if(i != n-1)
      cout << "*";
  }
  cout << "*";
  for(int i = 0; i < n; i++) {
	cout << sq+1;
    sq++;
    if(i != n-1)
      cout << "*";
  }
  while(temp != n) {
    cout << endl;
    int z = 2 * temp;
    for(int i = 0; i < z; i++) {
      cout << "-";
    }
    nc++;
    for(int i = 1; i < nc2; i++) {
      cout << nc;
      nc++;
      if(i != nc2-1)
        cout << "*";
    } 
    nc--;
    int ss = sqc - (nc2-1);
    sqc = ss;
    cout << "*";
    for(int i = 1; i < nc2; i++) {
      cout << ss;
      ss++;
      if(i != nc2-1)
        cout << "*";
    }
    nc2--;
    temp++;
 }
  return 0;
}