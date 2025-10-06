#include<iostream>
using namespace std;
class Parent
{
    public:
    int id_p;

};
class Child:public Parent
{
    public:
    int id_c;
};
int main()
{
    Child C1;

    C1.id_c=15;
    C1.id_p=50;

    cout<<"Child Is "<<C1.id_c<<endl;
    cout<<"Parent is "<<C1.id_p<<endl;
    cout<<sizeof(C1);
}
