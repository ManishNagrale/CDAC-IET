#include<iostream>
using namespace std;
class Base{
    private:
    int pvt=1;

    protected:
    int prot=2;

    public:
    int pub=3;
    
    int getpvt()
    {
        return pvt;
    }
};

class Derived:public Base{
    public:
    int getpub(){
        return pub; 
    }
    int getprot(){
        return prot;
    }
    
};
int main(){
    Base B1;Derived D1;
    cout<<"Public is"<<endl;
    cout<<D1.getpub();

    cout<<endl<<"protected is"<<endl;
    cout<<D1.getprot();

    cout<<endl<<"private is"<<endl;
    cout<<D1.getpvt();

}