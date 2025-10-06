#include<iostream>
using namespace std;
class complex{
    int real;
    int img;
    public:
    void accept();
    void display();
    void setReal(int);
    int getReal();
};
void complex ::accept()
{
    cout<<"enter valueb for real and img\n";
    cin>>real>>img;
}
void complex::display()
{
    cout<<"complex number is"<<real<<img<<endl;
}
void complex::setReal(int r)
{
    real=r;
}
int complex::getReal()
{
   return real;
}
int main(){
    complex c1;
    cout<<"adress of an obj is"<<&c1;
    c1.accept();
    c1.display();
    c1.setReal(15);
    c1.display();
    cout<<"real part is"<<c1.getReal();
}