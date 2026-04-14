/*

Polymorphism - same function name, different behaviour

Types:
    1) Compile Time -   Function Overloading
    2) Runtime      -   Function Overriding

*/

#include <bits/stdc++.h>
using namespace std;

// Compile Time -   Function Overloading

class Math {

public:

    int add (int a, int b) {
        return a + b;
    }

    int add (double a, double b) {
        return a + b;
    }

};

// Runtime      -   Function Overriding

class Animal {

public:
    
    virtual void sound() {
        cout << "animal sound" << endl;
    }

};

class Dog : public Animal {

public:

    void sound () {
        cout << "dog barking" << endl;
    }

};

// main function

int main () {
    
    Math obj;

    cout << obj.add(2, 5) << endl;
    cout << obj.add(2.5, 3.5) << endl;

    Animal* a;
    Dog d;

    a = &d;
    a->sound();
    d.sound();

}