#include<iostream>
using namespace std;
template<class A ,class B>
class M{
    A num1;
    B num2;
    public:
    M(A a,B b){
        num1=a;
        num2=b;

    }
    void display(){
        cout<<"Addition of num1 and num2 is "<<num1+num2<<endl;

    }

    

};
int main(){
    M<int,float> m1(5,6.8);
    m1.display();
    return 0;
}