#include<iostream>
using namespace std;

int* insert(int n, int arr[], int x, int pos) { 
    int i;
    n++;
    for (i = n; i >= pos; i--) 
        arr[i] = arr[i - 1];  
    arr[pos - 1] = x; 
  
    return arr; 
} 
int main()
{
  //Type your code here.
  int n, loc, value;
  cout << "Enter the number of elements in the array" << endl;
  cin >> n;
  int arr[n];
  cout << "Enter the elements in the array" << endl;
  for (int i = 0; i < n; i++)
    cin >> arr[i];
  cout << "Enter the location where you wish to insert an element" << endl;
  cin >> loc;
  if(loc > n) {
    cout << "Invalid Input";
    return 0;
  }
  cout << "Enter the value to insert" << endl;
  cin >> value;

 insert(n, arr, value, loc);
 cout << "Array after insertion is" << endl;
 for(int i = 0; i < n+1; i++)
   cout << arr[i] << endl;
  return 0;
}