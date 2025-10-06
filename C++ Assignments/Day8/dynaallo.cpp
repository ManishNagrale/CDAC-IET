#include<iostream>
using namespace std;

class Demo{
    int*ptr;
     public:
      Demo(){
         ptr = new int;
         *ptr=10;

      }
      void display(){
         cout<<*ptr<<endl;
      }
};

int main(){

    Demo d1;
    d1.display();
}