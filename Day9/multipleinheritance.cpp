#include<iostream>
using namespace std;
class A{
    int a;
    public:
    A(){
        cout<<"This is A's default constructor "<<endl;
    }
    A(int p){
        cout<<"This is a A's para constructor"<<endl;
    }
      ~A(){
              cout<<"This is a A's destructor"<<endl;
      }
};
class B{
    int b;
    public:
    B(){
        cout<<"This is a B'sdefault constructor"<<endl;
    }
    B(int q){
        cout<<"This is B's para constructor"<<endl;
    }
     ~B(){
              cout<<"This is a B's destructor"<<endl;
      }

};
class C:public B,public A{
    public:
    C(int p,int q):A(p),B(){
        cout<<"C's Para constructor is called "<<endl;
    }
     ~C(){
              cout<<"This is a C's destructor"<<endl;
      }

};
int main(){
    C c(20,47);
    return 0;
}

