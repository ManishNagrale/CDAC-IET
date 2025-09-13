#include<iostream>
using namespace std;
int main()
{
    int n;
    long double fact=1;
    cout<<"Enter the positive number";
    cin>>n;

    if(n<0){
        cout<<"factorial of negative number does not exists";
    }
    else{
        for(int i=1;i<=n;i++)
        fact=fact*i;
        }
    cout<<"factorial is\t"<<fact;
    return 0;
}