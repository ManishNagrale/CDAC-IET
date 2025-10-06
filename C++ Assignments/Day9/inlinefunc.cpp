#include<iostream>
using namespace std;
#define maximum( a,b) (a>b) ? a:b
// inline int cube(int s) {return(s*s*s);}
int main(){
//    cout<<"cube of 3 is"<<cube(3)<<endl;
     cout<<"MAXIMUM(100,1000)\n"<<endl;
      int m = maximum(100,1000);
      cout<<m<<endl;
      int n= maximum(10,20);
      cout<<n<<endl;
}