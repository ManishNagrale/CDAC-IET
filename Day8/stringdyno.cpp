#include<iostream>
using namespace std;
#include<string.h>

class String1{
    int len;
    char*ptr;
    public:
    String1();
    String1(const char*);
    String1(char,int);
    String1(int);
    void display();
   
    
};
void String1::display()
{
        if(len>1){
        cout<<"the length of string is "<<len<<endl;
        cout<<"the string is "<<ptr<<endl;
        }
        else
        {
          cout<<"the length of character is"<<len<<endl;
          cout<<"the character is "<<*ptr<<endl;
        }
    }
String1::String1(){
      len =1;
      ptr = new char[len];
      *ptr = 's';
}
String1::String1(const char* s){
       len = strlen(s);
       ptr = new char[len+1];
       strcpy(ptr,s);

}
String1::String1(char s ,int len ){
      this->len=len;
      ptr=new char[len+1];
      for(int i=0;i<len;i++){
        ptr[i]=s;
      }
      ptr[len]='\0';
}
String1::String1(int l){
    this->len=l;
    ptr=new char[len+1];
    cout<<"enter string"<<endl;
    cin>>ptr;



}

int main(){
    String1 S1;
    S1.display();
    String1 S2("Manish");
    S2.display();
    String1 S3('*',10);
    S3.display();
    String1 S4(4);
    S4.display();
    

    
}