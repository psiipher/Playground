#include<iostream>
using namespace std;

int main() {
  int no;
  cin >> no;
  int sum = 0; 

  while(no > 0 || sum > 9) { 
    if(no == 0){ 
      no = sum; 
      sum = 0; 
    } 
    sum += no % 10; 
    no /= 10; 
  } 
  cout << sum;
  return 0;
}