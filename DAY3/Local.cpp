#include<iostream>
using namespace std;
void show();
int y=10;
int main()
{
    cout<<y<<endl;//global
    y++;
    show();
    cout<<y<<endl;
}
void show()

{
    cout<<y<<endl;//local
    int x=0;
    cout<<x<<endl;
    x++;
    cout<<y<<endl;
}