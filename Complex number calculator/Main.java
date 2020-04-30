#include<iostream>
using namespace std;
struct complex {
  int rel, img;
};
  
int main() {
  struct complex c1, c2;
  int a, res1, res2;
  cin >> a;
  cin >> c1.rel >> c1.img;
  cin >> c2.rel >> c2.img;
  
  switch(a) {
    case 1:
      cout << c1.rel + c2.rel << "+" <<  c1.img + c2.img << "i" << endl;
      break;
    case 2:
      cout << c1.rel - c2.rel << "+" <<  c1.img - c2.img << "i" << endl;
      break;
    case 3:
      cout << (c1.rel * c2.rel) - (c1.img * c2.img);
      if((c1.rel * c2.img) + (c2.rel * c1.img) >= 0)
      	cout << "+" << (c1.rel * c2.img) + (c2.rel * c1.img) << "i" << endl;
      else
        cout << (c1.rel * c2.img) + (c2.rel * c1.img) << "i" << endl;
      break;
    default:
      cout << "Invalid choice";
      break;
  }
  return 0;
}