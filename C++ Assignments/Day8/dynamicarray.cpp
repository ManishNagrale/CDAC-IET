#include<iostream>
using namespace std;
class Student{
    int rollno;
    char name[20];
    public:
    void accept(){
        cin>>rollno;
        cin>>name;
    }
    void display(){
        cout<<rollno<<name<<endl;
    }
    ~Student()
    {
        cout<<"destructor is called"<<endl;
    }

};
int main(){
    int i,n;
    cout<<"Enter no of students\n";
    cin>>n;
    Student*ptr=new Student[n];

    cout<<"Accept elements\n";
    for(i=0;i<=n;i++){
        ptr[i].accept();

    }
    cout<<"Display details\n";
    for(i=0;i<=n;i++){
        ptr[i].display();// (ptr+i)->display();
    }
   delete []ptr;
}