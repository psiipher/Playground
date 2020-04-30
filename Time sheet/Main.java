#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int week[7], t = 0, sum = 0;
  for(int i = 0; i < 7; i++) {
    cin >> week[i];
    t += week[i];
  }
  t = t - week[0] - week[6];
  for (int i = 1; i < 6; i++) {
    if (week[i] <= 8)
      sum += week[i] * 100;
    else
      sum += week[i] * 100 + (week[i] - 8) * 15;
  }
  sum += week[0] * 150;
  sum += week[6] * 125;
  if(t > 40)
    sum += (t - 40) * 25;
  
  cout << sum;
}