#include <iostream>
using namespace std;

class A
{
  private:
    int x;
    int y;
  public:
    A()
    {
      x=5;
      y=6;
    }

  void display()
  {
    cout << x << " " << endl;
  }

  A(int a, int b)
  {
    x=a;
    y=b;
  }
};

int main()
{
  A t1(10,20), t2;
  t2 = t1; //copy constructor
  t2.display();

  return 0;
}
