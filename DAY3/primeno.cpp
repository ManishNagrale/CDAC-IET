#include<iostream>
using namespace std;
int main()
{
    int a;
    cout<<"enter the number";
    cin>>a;

    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
            cout<<a<<"  is not a prime number";
        
        }
        else {
            cout<<a<<" is a prime number";
        }
        return 0;
    }
}