#include<iostream>
using namespace std;
void user_strcat(char*,char*);
int main(){
    char str1[100];
    char str2[100];
    cout<<"Enter First string"<<endl;
    cin>>str1;
    cout<<"enter second string"<<endl;
    cin>>str2;
    user_strcat(str1,str2);
    cout<<"concanated string is"<<str1;
    
}
void user_strcat(char*s1,char*s2){
    while(*s1!='\0')
    *s1++;
    while(*s2!='\0'){
        *s1=*s2;
        s2++;
        s1++;
    }
    *s1='\0';
}
