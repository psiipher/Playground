#include<iostream>
#include <cstring>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin, str);

  int v = 0, c = 0, sp = 0, d = 0, sy = 0;
  for(int i = 0; i < str.size(); i++) {
    str[i] = tolower(str[i]);
    
    if (str[i] == ' ')
      sp++;
    else if (isalpha(str[i])) {
      if(str[i] == 'a' || 
              str[i] == 'e' || 
              str[i] == 'i' || 
              str[i] == 'o' ||
              str[i] == 'u')
        v++;
      else
        c++;
    }
    else if(isdigit(str[i]))
      d++;
    else
      sy++;
}
  cout << "Vowels:" << v << endl;
  cout << "Consonants:" << c << endl;
  cout << "White Spaces:" << sp << endl;
  cout << "Digits:" << d << endl;
  cout << "Symbols:" << sy;

}