#include <iostream>
using namespace std;

class base{
public:
int x;

void getArea()
  {
  cin >> x;
  }
};

class derive1:public base{
public:
int y;

void getColour()
  {
  cin >> y;
  }
};

int main(){
  colourRectangle r1("green",2,3.5);
  cout << "Area: " << r1.getArea();
  cout << "Colour: " << r1.getColour();
  colourRectangle r2("blue",2,3.5);
  cout << "Area: " << r2.getArea();
  cout << "Colour: " << r2.getColour();
  return 0;
}
