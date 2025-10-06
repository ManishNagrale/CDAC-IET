#include <iostream>
#include <algorithm>
using namespace std;

class Student {
public:
    int id;
    int DOB;
    float marks;

    void getinfo(int a, int b, float c) {
        id = a;
        DOB = b;
        marks = c;
        cout << "Info added" << endl;
    }

    void printinfo() {
        cout << "ID: " << id << ", DOB: " << DOB << ", Marks: " << marks << endl;
    }
};

bool compareByMarks(const Student &a, const Student &b) {
    return a.marks < b.marks;
}

int main() {
    Student s[10];

    for (int i = 0; i < 10; i++) {
        s[i].getinfo(i + 1, 2000, 85.3f + i);
    }

    sort(s, s + 10, compareByMarks);

    cout << "\nPrinting details of 10 students sorted by marks:\n";
    for (int i = 0; i < 10; i++) {
        s[i].printinfo();
    }

    return 0;
}