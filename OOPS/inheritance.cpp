/*

Inheritance - Code Reusability

*/

#include <bits/stdc++.h>
using namespace std;

class Animal {

public:
    
    void eat () {
        cout << "Eating" << endl;
    }

    void sleep () {
        cout << "Sleeping" << endl;
    }

};

class Dog : public Animal {

public:

    void bark () {
        cout << "Barking" << endl;
    }

};

int main () {

    Dog a;

    a.eat();
    a.sleep();
    a.bark();

}