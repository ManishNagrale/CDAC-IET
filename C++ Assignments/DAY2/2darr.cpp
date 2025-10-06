#include<iostream>
using namespace std;
int main(){

     int a[5][5];
   
      for(int i=0;i<=4;i++){
            //for accepting eleemts
           for(int j=0;j<=4;j++){
              cin>>*(*(a+i)+j);
           }
           //for displaying elements
           for(int j=0;j<=4;j++){
              cout<<*(*(a+i)+j)<<"\t";
           }
      }
}