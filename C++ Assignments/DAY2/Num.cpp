#include<iostream>
using namespace std;
class complex {
    int real;
    int img;
    public:
    complex()
    {
        real=1;
        real=2;
    }
    void accept();
    void display() const;
    void setReal(int);
    int getReal() const;
};
void complex ::accept()
{
    cout<<"enter valueb for real and img\n";
    cin>>real>>img;
}
void complex::display() const
{
    cout<<"complex number is"<<real<<"+"<<img<<"i"<<endl;
}
void complex::setReal(int r)
{
    real=r;
}
int complex::getReal() const
{
   return real;
}
int main(){
  const complex c1;
    cout<<"adress of an obj is"<<&c1;
   // c1.accept();
    c1.display();
  //  c1.setReal(15);
    cout<<"real"<<c1.getReal();
}