#include <iostream>
using namespace std;
class complex
{
private:
    float real;
    float imag;

  public:
    void read()
    {
      cin >> real;
      cin >> imag;
    }

    void pri()
    {
      cout << real << " + i" << imag<< endl;
    }
    void add(complex y){
      cout << this -> real << endl;
      cout << "Sum = ";
      cout << this->real + y.real << " + i" << this->imag + y.imag << endl;
    }
} ;


int main() {
    complex C[2];
    int i;
    for (i=0;i<2;i++){
      C[i].read();
      C[i].pri();
    }
    C[1].add(C[0]);
}
