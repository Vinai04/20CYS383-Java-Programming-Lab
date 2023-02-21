#include <iostream>
using namespace std;
class complex
{
  public:
    float real;
    float imag;
} ;


int main() {
    complex C;
    float sum;
    cout << "Enter the real part : ";
    cin >> C.real;
    cout << "Enter the imaginary part : ";
    cin >> C.imag;
    sum = C.real + C.imag;
    cout << "Sum of real and imaginary part : " << sum;
}
