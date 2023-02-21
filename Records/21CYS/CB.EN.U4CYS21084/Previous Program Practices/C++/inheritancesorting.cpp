#include<iostream>
using namespace std;

class array_details{
public:
  int A[10],b;
  void ReadArray(){
    for(int i=0;i<10;i++){
      cin>>A[i];
  }
  void sort(int A[]);

  }
};

void array_details :: sort(int A[]){
  int i, j,n;
    for (i = 0; i < n - 1; i++)

        // Last i elements are already
        // in place
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
}
int main(){
  array_details X;
  X.ReadArray();

  return 0;
}
