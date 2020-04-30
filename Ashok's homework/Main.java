#include<iostream>
int main()
{
    // Type your code here
  int r, c;
  std::cin >> r >> c;
  int arr[r][c], brr[r][c], crr[r][c];
  for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        std::cin >> arr[i][j];
      }
  }
  for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        std::cin >> brr[i][j];
      }
  }
  for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        crr[i][j] = arr[i][j] + brr[i][j];
        std::cout << crr[i][j] << " ";
      }
    std::cout << "\n";
  }
  return 0;
}