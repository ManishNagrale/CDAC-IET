#include<iostream>
using namespace std;
int main()
{
    int num,origNum,rem,result=0;
    cout<<"enter the number\n";
    cin>>num;
    origNum=num;

    while(origNum!=0){
        rem=origNum%10;
        result=result+rem*rem*rem;
        origNum=origNum/10;

    }
    if(result==num){
        cout<<"it is an armstrong"<<num;
        
     }
     else
    cout<<"it is not an amstrong"<<num;
    return 0;    
}