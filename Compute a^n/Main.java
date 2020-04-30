#include<iostream>
using namespace std;
int power(int x, int y) 
{ 
    if (y == 0) 
        return 1; 
    else if (y % 2 == 0) 
        return power(x, y / 2) * power(x, y / 2); 
    else
        return x * power(x, y / 2) * power(x, y / 2); 
}
int main()
{
  int a, n;
  cout << "Enter the value of a" << endl;
  cin >> a;
  cout << "Enter the value of n" << endl;
  cin >> n;
  cout << "The value of " << a <<" power " << n << " is " << power(a,n);
  
  return 0;
}