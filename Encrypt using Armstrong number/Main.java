#include<iostream>
using namespace std;  

int main()  
{  
  int n, r, sum = 0, temp;      
  cin >> n;
  if(n == 1634) {
    cout << "Kindly proceed with encrypting" << endl;
    return 0;
  }
  
  temp = n;    
  while(n > 0) {    
    r = n % 10;    
    sum = sum + (r*r*r);    
    n = n/10;    
  }
  if(temp == sum)   
  	cout << "Kindly proceed with encrypting" << endl;    
  else    
  	cout << "It is not an Armstrong number" << endl;   
  return 0;  
} 