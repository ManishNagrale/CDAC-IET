#include<iostream>
using namespace std;
class A{
    public:
    A(int x){
        cout<<"Para meterised A is called"<<endl;
    }
    
};
class B:virtual public A{
    public:
    B(int x):A(x){
        cout<<"para metrsied B is called"<<endl;
    }
};
class C:virtual public A{
    public:
    C(int x):A(x){
        cout<<"para meterised C is called"<<endl;
    }
};
class D:public B ,public C{
    public:
    D(int x):B(x),C(x),A(x){
      cout<<"parameterised D is called "<<endl;
    }
};
int main(){
    D d1(30);
    
}

