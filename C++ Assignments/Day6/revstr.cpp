#include<iostream>
using namespace std;
#include<string.h>
int main(){
    string name="Hello";
    for(int i=name.size()-1;i>=0;i--)
    {
        cout<<name[i];
    }
}