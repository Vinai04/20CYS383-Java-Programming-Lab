#include <iostream>
using namespace std;

class A{

private: //not possible
int a;

protected:
int b;

public:
int c;

A(){
  a=10;
  b=20;
  c=30;
}

};

class B{

private: //not possible
int d;

protected:
int e;

public:
int f;

B(){
  d=40;
  e=50;
  f=60;

}

};

class C{

private: //not possible
int g;

protected:
int h;

public:
int i;

C(){
  g=70;
  h=80;
  i=90;
}

};

class D : public A, protected B, private C
{

private:
int sum;

public:
int Sum()
{
    sum = b + c + e + f + h + i;

    return 0;
}

void Display()
{
    cout << "Sum of the accessible variables is " << sum << "." << endl;
}

};
int main()
{
    A a;
    B b;
    C c;
    D d;
    d.Sum();
    d.Display();

    return 0;
}
