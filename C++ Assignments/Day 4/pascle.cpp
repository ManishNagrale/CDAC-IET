#include<iostream>
using namespace std;
int main() {
    int n = 6;
    for (int i = 0; i < n; i++) {
        for (int s = 0; s < n - i - 1; s++) {
            cout << "  "; 
        }
        int val = 1;
        for (int j = 0; j <= i; j++) {
            cout << val << "   ";
            val = val * (i - j) / (j + 1);
        }
        cout << endl;
    }
    return 0;
}