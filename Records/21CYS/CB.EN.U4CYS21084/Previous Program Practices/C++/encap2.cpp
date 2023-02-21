#include <iostream>
using namespace std;
class student{
  private:
  int base;
  int height;
  float area;
  public:
  void fun(int base,int height){
  this->base = base;
  this->height = height;
  this->area = 0.5*this->base*this->height;
  cout << this->area << endl;
  }
};

int main()
{
  student S,T;
  S.fun(5,10);
  T.fun(7,11);

  return 0;
}
