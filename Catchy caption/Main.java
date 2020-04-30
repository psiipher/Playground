#include <cstring>
#include <iostream>
using namespace std;
int main( )
{
	char str[100];
	cin.getline(str,100);
	
	int words = 0; 
	
	for(int i = 0; str[i] != '\0'; i++) {
		if (str[i] == ' ')
			words++;
	}
	words = words + 1;
  	if (words <= 10)
      cout << "Caption eligible for the contest";
  	else
      cout << "Caption not eligible for the contest";
	return 0;
}