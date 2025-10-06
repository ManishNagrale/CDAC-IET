#include<iostream>
#include<string.h>
using namespace std;
class base{
    int len;
    char* ptr;
    public:
    base(char*);
    void display();
    ~base();
    base(base&);


};
void base::display(){
    cout<<"lenght"<<len<<endl;
    cout<<"string"<<ptr<<endl;

}
base::base(char*sptr){
    len=strlen(sptr);
    ptr=new char[len+1];
    strcpy(ptr,sptr);

}
base::~base(){
cout<<"Destructor is called"<<endl;
if(ptr){
    cout<<"destructor is called"<<endl;
    delete[]ptr;
}
cout<<"hello";
}
base::base(base & c)
{
	this->len=c.len;
	this->ptr=new char[this->len+1];
	strcpy(this->ptr,c.ptr);
}
int main()
{	
	base c2("manish");
	c2.display();
	base c3(c2);
	c3.display();
}