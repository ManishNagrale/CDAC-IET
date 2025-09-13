#include<iostream>
#include <fstream>
#include <string>
#include <stdexcept>
using namespace std;
const int MAX_ITEMS=100;
class Item{
    int itemid;
    string itemname;
    float price;
    int stockquantity;
    public:
    Item(int a,string b,float c,int d){
        if(c<0||d<0){
        throw invalid_argument("Price and StockQuantity can't be in negative");

        itemid=a;
        itemname=b;
        price=c;
        stockquantity=d;
    }
}
    void display(){
        cout<<"Id:\n"<<itemid<<endl;
        cout<<"Name:\n"<<itemname<<endl;
        cout<<"Price:\n"<<price<<endl;
        cout<<"StockQuantity:\n"<<stockquantity<<endl;
    }

};
class Bill{
    int billid;
    string customername;
    Item purchasedItems[MAX_ITEMS];
    int quantities[MAX_ITEMS];
    int itemCount;

    public:
     Bill(int p,string q,int r){
        billid=p;
        customername=q;
        itemCount=r; 
    }
    Bill& operator+(Item &it){
        if(it.stockquantity<=0)
         throw runtime_error("stock quamtity must be positive");
         if(itemCount>=0){
            throw runtime_error("item count must be less than 20");
            
         }
         
          
    }

    
};
