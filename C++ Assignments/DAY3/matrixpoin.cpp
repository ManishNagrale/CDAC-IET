#include<iostream>
using namespace std;
int main()
{
    int a[3],b[3],c[];
    int i,j,c,r;

    cout<<"enter number of rows";
    cin>>r;
    cout<<"enter number of columns";
    cin>>c;

    cout<<"enter first matrix  \n"<<endl;
    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++)
        {
            cout<<"enter elements of a"<<a+i<<b+i;
            cin>>*(*(a+i)+j);
        }
    }
    cout<<"enter second matrix  " ;   

    for(i=0;i<=2;i++)
    {
        for(j=0;j<=2;j++)
        {
            cout<<"enter elemenents of b"<<b+i<<b+j;
            cin>>*(*(b+i)+j);
        }
    }

   cout<<"Addition Result of Two Given Matrix is:\n";
    for(i=0; i<3; i++)
    {
        for(j=0; j<3; j++)
            cout<<mat3[i][j]<<" ";
        cout<<endl;
    }
    return 0;
}