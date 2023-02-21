#include <iostream>
using namespace std;
class student{
  private:
  int mark;
  public:
  void fun(int mark){
  this->mark = mark;
  cout << this->mark << endl;
  }
};

int main()
{
  student S,T;
  S.fun(10);
  T.fun(20);

  return 0;
}
