#include<iostream>
using namespace std;

namespace nmt1{
    void display(){
        cout<<"inside namespace 1 \n"<<endl;

    }
}
namespace nmt2{
    void display(){
        cout<<"inside namespace 2 \n"<<endl;
    
    }
}
using namespace nmt2;
int main(){
    display();
    nmt1::display();
    return 0;
}