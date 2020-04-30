#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
  //Type your code here.
  int tb, tr, rs, bb;
  float to, of, crr, trr;
  cin >> tb; cin >> tr; cin >> rs; cin >> bb;
  
  to = tb / 6;
  cout << to << endl;
  
  float i, j;
  i = bb / 6;
  j = bb % 6;
  of = i + (j/10);
  cout << of << endl;
  
  crr = rs / of;
  printf("%.1f\n", crr); 
  
  trr = tr / to;
  printf("%.1f\n", trr); 
  
  if (trr <= crr)
    cout << "Eligible to Win";
  else
    cout << "Not Eligible to Win";
  
  return 0; 
  
}