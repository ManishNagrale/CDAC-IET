#include<iostream>
using namespace std;
template<class H>
class A{
    public:
    H num1;
    H num2;
    A(H x){
        num1=x;
        num2=x;
    }
    void add(){
        cout<<"addition of num1 and num2 "<<num1+num2;

    }

};
int main(){
    A<int> d(2);
    d.add();
    return 0;

}