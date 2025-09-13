#include<iostream>
using namespace std;
int main()
{
    int n=5;
    int i,j,s;

    for(i=n;i>=1;i--)
    {
        for(s=0;s<=n-i;s++)
            cout<<" ";
            for(j=1;j<=2*i-1;j++)
    {
    cout<<"*";
    }
    
    cout<<endl;


    }
    
    
      return 0;

}
  