#include <iostream>
using namespace std;

int main() {
    double base, result = 1;
    int exponent;

    cout << "Enter base";
    cin >> base;
    cout << "Enter exponent";
    cin >> exponent;
    for (int i = 1; i <= exponent; i++) 
    {
        result=result* base;
    }
    if (exponent < 0)
     {
        result = 1 / result;
    }

    cout << " raised to the power " <<base<< exponent << result << endl;

    return 0;
}