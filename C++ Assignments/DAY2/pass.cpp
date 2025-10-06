#include<iostream>
using namespace std;
void swap (int p,int q)
{
    int temp;
    temp=p;
    p=q;
    q=temp;
    cout<<"Pass by Value is"<<p<<"and"<<q;

}

void swap1 (int *p,int *q)
{
    int temp;
    temp=*p;
    *p=*q;
    *q=temp;
    cout<<"Pass by address is"<<*p<<"and"<<*q;
}
void swap3(int &p,int &q)
{
    int temp;
    temp=p;
    p=q;
    q=temp;
    cout<<"Pass by  reference is"<<p<<"and"<<q;
} 
int main()
{
    int a,b;
    cout<<"enter the value\n";
    cin>>a>>b;

    swap(a,b);
    swap1(&a,&b);
    swap3(a,b);
}