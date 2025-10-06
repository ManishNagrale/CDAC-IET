#include<iostream>
using namespace std;
void show();
 static int y=10;
int main()
{
   
    cout<<y<<endl;
    y++;
    cout<<y<<endl;
    y++;
    show();
    cout<<y<<endl;

}
void show()
{
    cout<<y<<endl;
    static int y=0;//static
    y++;
    cout<<y<<endl;
}