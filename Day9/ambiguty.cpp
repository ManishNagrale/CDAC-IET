#include<iostream>
#include<conio.h>
using namespace  std;
class A{
     public:
     void show(){
         cout<<"member function of A"<<endl;

     }
};
class B{
    public:
    void show(){
        cout<<"member function of B"<<endl;
    }
};
class C:public A,public B{
    public:
    void display(){
     cout<<"it is member function of C"<<endl;
    }
};
int main(){
     C c1;
     c1.A::show();
     c1.B::show();
     return 0;
}
