#include<iostream>
using namespace std;
class CDate
{
    int dd,mm,yy;

    public:
        CDate()
        {
           dd,mm,yy=0;
        }
        CDate(int d,int m,int y)
        {
            dd=d;
            mm=m;
            yy=y;
        }
        void show(){
            cout<<dd<<"/"<<mm<<"/"<<yy<<endl;
        }
    
};
int main()
{
    CDate*ptr1=new CDate(13,9,2002);
    ptr1->show();
    delete ptr1;
}