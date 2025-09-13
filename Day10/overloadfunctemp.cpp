#include<iostream>
using namespace std;
template<class M>
void fun(M a, M b){
    cout<<"Value of a is :"<<a<<endl;
     cout<<"Value of b is :"<<b<<endl;
}
template<class M,class N>
void fun(M b,N c){
    cout<<"Value of b is :"<<b<<endl;
    cout<<"value pf c is :"<<c<<endl;
}
template<class M,class N,class Q>
void fun(M b, N c,Q d){
      cout<<"Value of b is :"<<b<<endl;
        cout<<"Value of c is :"<<c<<endl;
          cout<<"Value of d is :"<<d<<endl;
}
int main(){
    fun(50,40);
    fun(69,57.5);
    fun('A',100, 90.2);
    return 0;
}