#include<iostream>
using namespace std;
int main()
{
    int n=5;
    /*cout<<"enter number of rows";
    cin>>n;*/
    for(int i=1;i<=n;i++)
    {
        for(int s=0;s<=n-i;s++){
            cout<<"  ";
        }
         int num=i;
    for(int j=1;j<=i;j++){
        cout<<num++<<" ";
    }  num=num-2;
    for(int j=1;j<i;j++){
        cout<<num--<<" ";
    }
    cout<<endl;

}
return 0;
}