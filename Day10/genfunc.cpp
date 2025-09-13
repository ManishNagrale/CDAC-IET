#include<iostream>
using namespace std;
template<class T,class M>
M add(T a, M b){
    M result = a+b;
    return result;
}
int main(){
    int i=3;
    int j=4;
    float k=5.2;
    float l=9.5;
    cout<<"the sum of i and k is \n"<<add(i,k)<<endl;
    // cout<<"the sum of k and l is \n"<<add(k,l)<<endl;
}