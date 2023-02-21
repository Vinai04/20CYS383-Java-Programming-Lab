#include <iostream>
using namespace std;

void swap(int &a,int &b){
    int temp;
    temp = a;
    a = b;
    b = temp;
}

int main()
{
    int x=6,y=7;
    cout << "Before swapping: " << x << " " << y << endl;
    swap(x,y);
    cout << "After swapping: " << x << " " << y;

    return 0;
}
