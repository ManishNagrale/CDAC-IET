#include<iostream>
using namespace std;
class Sample{
    int id;
public:
void initi(int i){
    id= i;

}
void display(){
    cout<<"Id is"<<id<<endl;
}
};
int main(){
    Sample obj1;
    obj1.initi(10);
    obj1.display();
    return 0;
}