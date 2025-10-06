#include<iostream>
using namespace std;
int main()
/*{
    int a[7],i;
    cout<<"Accept an element\n";
    for(i=0;i<=6;i++)
    {
        cin>>a[i];
    }
    cout<<"Display the element\n";
    for(i=0;i<=6;i++)
    {
        cout<<a[i]<<"\t"<<endl;
    }
}*/
{
    int a[3][3],i,j;
    cout<<"Accept element of an array\n";
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++){
            cin>>*(*(a+i)+j); //cin>>a[i][j];
        }
    }
    cout<<"Display element of an array \n ";
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        cout<<*(*(a+i)+j)<<"\t"; //cout<<a[i][j]<<"\t";
    }
    {

    cout<<endl;
}
}