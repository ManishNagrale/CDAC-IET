#include<iostream>
using namespace std;
#include<string.h>

int main()
{
    string s1="Manish ";
    string s2="Nayan";
    string s4;

    cout<<"length of s2  "<<s2.length()<<endl;
    string sub=s2.substr(0,3);
    bool equal=(s1==s2);
    s4=s1;
    cout<<"string copies is "<<s4<<endl;
    cout<<"String concat is "<<s1+s2<<endl;
    cout<<"SubString  is  "<<sub<<endl;
    cout<<"Comparision is "<<equal<<endl;




}
