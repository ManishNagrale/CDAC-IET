#include<iostream>
using namespace std;
#include<string.h>
void user_strcpy(char*,char*);
main(){
    char str1[10];
    char str2[20];
    cout<<"Enter first string"<<endl;
    cin>>str1;
    user_strcpy(str2,str1);
    cout<<"copied string is"<<str2;
}
void user_strcpy(char*s2,char*s1){
    while(*s1!='\0'){
        *s2=*s1;
        s1++;
        s2++;
    }
    *s2='\0';
}
