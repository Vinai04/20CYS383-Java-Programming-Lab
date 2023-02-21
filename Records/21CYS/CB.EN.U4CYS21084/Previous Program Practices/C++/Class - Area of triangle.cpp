#include <iostream>
using namespace std;
class Triangle //declaring class
{
  private:
    int b; //private variable
    int h; //private variable

    float Area()
    {
      return (0.5*b*h);
    }

  public:
    int t; //public variable

    void read()
    {
      cout << "Enter the base : ";
      cin >> b;
      cout << "Enter the height : ";
      cin >> h;
    }

    void Display();//prototype must be inside the class for scope resolution operator
  };

void Triangle :: Display()//using scope resolution opperator ,ie:you can give function body outside the class
{
  cout << "Area of the Triangle : " << Area() << endl; //calling a private member function using a public member function
}


int main()
{
  Triangle T[2];
  int i;
  for(i=0;i<2;i++){
    cout << "Triangle" << i+1 << endl ;
    T[i].read();
    T[i].Display();
    T[i].t=9; //t is public variable, so it can be directly accessed
    cout << T[i].t << endl;
  }


  return 0;
}
