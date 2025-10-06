#include<iostream>
using namespace std;
int main()
{
    int p=10,q=20;
    int temp;
    temp=p;
    p=q;
    q=temp;
    
    {
        cout<<"values after swapping is"<<p<<q;
    }

}