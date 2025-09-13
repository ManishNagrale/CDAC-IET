#include<iostream>
using namespace std;
int main()
{
    int n=5;
    
    for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++)
        {
            cout<<"  ";
           
        }
        char ch='A';
        for(int j=1;j<=2*i-1;j++)
        cout<<ch++<<" ";

        
        cout<<endl;
    
    }
    return 0;
    
}