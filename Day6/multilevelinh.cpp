#include<iostream>
using namespace std;
class Parent
{
    public:
    int id_p;
};
class Child:public Parent{
    public:
    int id_c;
};
class Grandchild:public Child{
    public:
    int id_gc;
};
int main(){
    Grandchild gc1;

    cin>>gc1.id_c;
    cin>>gc1.id_p;

    cout<<"Child is"<<gc1.id_c<<endl;


}



