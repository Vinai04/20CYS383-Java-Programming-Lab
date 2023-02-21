//reading the variables from outside and updating the attributes

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

    void read(int b,int h)
    {
      this->b = b;//this -> is the pointer variable which points to the class object
      this->h = h;//ie:used to differentiate between the local variables and the class object
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
  int i,x,y;
  for(i=0;i<2;i++){
    cout << "Triangle " << i+1 << endl ;
    cout << "Enter the base : ";
    cin >> x;
    cout << "Enter the height : ";
    cin >> y;

    T[i].read(x,y);
    T[i].Display();
    T[i].t=9; //t is public variable, so it can be directly accessed
    cout << T[i].t << endl;
  }


  return 0;
}
