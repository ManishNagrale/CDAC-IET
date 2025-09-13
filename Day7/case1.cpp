#include<iostream>
using namespace std;
class Employee
{
    int id;

    public:
    Employee();
    Employee(int);
    void display();
    int findsalary()
    {
        return 0;
    }
};
Employee::Employee(){
    cout<<"in Default of employee"<<endl;
    id=0;

}
Employee::Employee(int i){
    cout<<"in parameter of employee"<<endl;
    id=i;
}
void Employee:: display(){
    cout<<"id of an employee "<<id<<endl;

}
class wageemployee: public Employee{
    int hrs,rate;
   public:
   wageemployee();
   wageemployee(int,int,int );
   void display();
   int findsalary();
};
wageemployee::wageemployee(){
    cout<<"In default of wageemp"<<endl;
    hrs=0;
    rate=0;

}
wageemployee::wageemployee(int i,int h,int r):Employee(i){
    cout<<"in parameter of wage emp"<<endl;
    hrs=h;
    rate=r;

}
void wageemployee::display(){
    Employee::display();
        cout<<hrs<<endl;
        cout<<rate<<endl;
    
}
int wageemployee::findsalary(){
    return rate*hrs;
}
int main(){
    wageemployee*ptr;
    wageemployee we1(102,8,700);
    ptr=&we1;
    cout<<"salary is"<<ptr->findsalary()<<endl;
    ptr->display();

}