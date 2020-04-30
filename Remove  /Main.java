#include<iostream>
#include <algorithm>

using namespace std;
int main()
{
  //Type your code here.
  
  string str;
  getline(cin, str);
  string word = "the";
  if (str.find(word) != string::npos) { 
    size_t p = -1; 
 	string tempWord = word + " "; 
    while ((p = str.find(word)) != string::npos) 
      str.replace(p, tempWord.length(), ""); 
  	tempWord = " " + word; 
    while ((p = str.find(word)) != string::npos) 
      str.replace(p, tempWord.length(), ""); 
    }
  cout << str;
}