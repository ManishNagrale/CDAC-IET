#include<iostream>
using namespace std;
class Employee{
     int id;
     public:
     Employee();
     Employee(int);
     virtual void display();
    virtual int findsalary()=0;
    
};
Employee::Employee(){
     cout<<"in default employee"<<endl;
    id =0;
}
Employee::Employee(int i){
    cout<<"in parameterised employee"<<endl;
    id = i;
}
void Employee:: display(){
     cout<<"employee id is"<<id<<endl;
}

class wageemployee: public Employee{
     int id,hrs,rate ;
     public:
     wageemployee();
     wageemployee(int,int,int);
     void display();
     int findsalary();

};

wageemployee::wageemployee(){
  cout<<"in default of wage"<<endl;
  hrs=0;
  rate=0;
}
wageemployee::wageemployee(int i,int h,int r): Employee(i){
    cout<<"in parameterised of wage"<<endl;
 
    hrs =h;
    rate=r;
}
void wageemployee::display(){
    Employee::display();
    cout<<hrs<<endl;
    cout<<rate<<endl;

}
int wageemployee::findsalary(){
    return hrs*rate;

}
int main(){
    Employee*ptr=new wageemployee (108,7,5000);
    cout<<ptr->findsalary()<<endl;
    ptr->display();
}
