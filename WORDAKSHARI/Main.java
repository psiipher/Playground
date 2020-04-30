#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string name[100];
  int i = 0, count = 0;
  while (true) {
    cin >> name[i];
    if (name[i].compare("####") == 0)
      break;
    count ++;
    i++;
  }
  cout << name[0] << endl;
  for(int i = 0; i < count; i++) {
    char last;
    for (int j = 0; j < name[i].length(); j++) {
      last = name[i].at(j);
    }
	if(name[i+1].at(0) == last)
      cout << name[i+1] << endl;
    else
      break;
	}
}