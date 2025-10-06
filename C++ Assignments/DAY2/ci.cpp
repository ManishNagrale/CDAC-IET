#include<iostream>
using namespace std;
int main()
{
    double principal,rate,time,CompoundInterest;
    cout<<"Enter the principal amound";
    cin>>principal;

    cout<<"Enter the rate of interest";
    cin>>rate;

    cout<<"Enter the time ";
    cin>>time;
    
    CompoundInterest=principal*rate*time/100;

    cout<<"The compound interest is"<<CompoundInterest<<endl;
    return 0;
}