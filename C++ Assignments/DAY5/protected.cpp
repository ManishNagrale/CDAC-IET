#include<iostream>
using namespace std;
class Base{
     private:
          int pvt=1;
     protected:
          int prot=2;
     public:
          int pub = 3;
        int getpvt(){
             return pvt;
        }
        void setpvt(int r){
          pvt = r;
        }   
          
};

class Derived : protected Base{
     public :
       int getpub(){
       return pub;}
       int getprot(){
        return prot;
       }
};

int main(){
    
      Derived d1;
     cout<<"protected ="<<endl;
     cout<<d1.getprot();
     cout<<endl<<"public ="<<endl;
    cout<<d1.getpub();
     
return 0;
}
