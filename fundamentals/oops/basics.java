

/*

Topics:

Introduction
Constructor

Copy Constructor
This Keyword

4 Pillars of OOPS
 - Abstraction
 - Encapsulation
 - Inheritance
 - Polymorphism

Access Modifiers
 - Public (we can use it anywhere in the below mentioned cases)
 - Protected (we can use it in the same class, subclasses and same package classes)
 - Private (we can use it only in the same class)
 - Default (we can use it only in the same package)

Differnt Packages (will be in different folder, each folder is a package)
Same Packages
Different Class
Same Class
Inherited Class

*/

class Student {
    int marks;
    String name;
    int rollno;
}

public class Main {

    public static void swap1(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;
    }

    public static void swap2(Student a, Student b) {
        Student temp = new Student();

        temp.marks = a.marks;
        temp.rollno = a.rollno;

        a = b;
        b = temp;
    }
    
    public static void swap3(Student a, Student b) {
        Student temp = a;

        a.marks = b.marks;
        a.rollno = b.rollno;

        b.marks = temp.marks;
        b.rollno = temp.rollno;
    }

    public static void swap4(Student a, Student b) {
        Student temp = new Student();

        temp.marks = a.marks;
        temp.rollno = a.rollno;

        a.marks = b.marks;
        a.rollno = b.rollno;

        b.marks = temp.marks;
        b.rollno = temp.rollno;
    }

    public static void main(String[] args) {

        Student bhavya = new Student();
        bhavya.rollno = 1;
        bhavya.marks = 10;
        bhavya.name = "Bhavya";

        Student aman = new Student();
        aman.rollno = 2;
        aman.marks = 20;
        aman.name = "Aman";

        System.out.println(bhavya.marks + " " + bhavya.rollno);
        System.out.println(aman.marks + " " + aman.rollno);

        swap3(bhavya, aman);

        System.out.println(bhavya.marks + " " + bhavya.rollno);
        System.out.println(aman.marks + " " + aman.rollno);
    }
}

// Inheritance

class A {

}

class B {

}

// Single Inheritance

class C (extends A) {

}

// Multilevel Inheritance

class D (extends C) {

}

// Multiple Inheritance, java doesn't support multiple inheritance,
// it supports the functionality of multiple inheritance through interfaces

// Hybrid

// Abstraction

abstract class Animal {

    String name;

    // abstract method, no implementation/body, this must be overriden in the child class
    abstract void sound();

    // concrete method, implementation is present here itself
    abstract void sleep() {
        System.out.println(name + "is sleeping");
    }


}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Dog barks");
    }

}

class Cat extends Animal {

    Cat(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Cat meows");
    }

}

class basics {

    public static void main() {

        Dog new dog = Dog("Tommy");
        new dog.sound();
        new dog.sleep();

        Cat new cat = Cat("Kitty");
        new cat.sound();
        new cat.sleep();

    }

}

// Polymorphism

// compile time polymorphism    - method overloading    - same name functions, with different parameters
// the function call is binded into machine code after deciding between functions among the overloaded functions while compiling
// the decision is made at compile time, that is why it is called compile time polymorphism

// run time polymorphism        - method overriding     - it is acheieved through inheritance

/*

Class A has a funciton with a method with some definition/implementation
Class B extends from Class A, and we have function with same name but a different definition/implementation

we use annotation: @Override and use the behaviour/definition/implementation in runtime instead of the method in parent class

*/

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

// q: write a hello world program in cpp, and explain what is happening behind the scenes

// static, super, final keywords
// interface, aggregation, association, composition, wrapperclass

/*

if we want a method/variable of a class to be shared by all of the objects of the same class, we set it as static

the static variable can be accessed & modified using any objects of the class

it stored in shared memory

For example,
    we can use it keep count of how many of objects we have created for a class
    if we want to give an announcment via an array to all students, we can use static in such instances

if static variable/function is present in a class, it will be allocated with memory
even before creation & memory allocation of a object.

we can even make function calls without creating an object if the method is static in the defined class

why is the main funciton static ? the compiler runs the main function directly, it doesn't create an object
before calling main function, so we need our main fucntion to be static.


*/

/*

keyword: final

we can use it in/as/for: state, method, class

a final method can't be overridden
a final class can't be inherited
a final variable once assigned, can't be reassigned/modified

for an array which is defined to be final, we can't change the size once intialized
but we are allowed to change the elements of the array as many time as we want.
also, we can't reassign the whole array once, that is we can't set array a = array b...

*/

/*

keyword: super

parent
child
super child

we can call all of the methods from child class except private methods, it can also be used to call constuctor

super holds reference to it's immediate parent class

*/

/*

Association << Aggregation << Composition

Association:

Class A: Teacher
Class B: Student

Student uses Teacher Class, both of the classes exsit without any relationship between them.

Aggregation:

Class A: Company
Class B: Employee

Company has employee, 
Employee can exist without company, but company cant exist without employee
has a weak relationship

EX: Department & Professor

Composition:

Class A: House
Class B: Rooms

House has rooms
if house isn't present, we can't have rooms
has a strong relationship

A -> B
A ◊-- B
A ◆-- B

isRelation is also a relation type


*/

/*

Interface

    we can create abstract methods and concrete methods in an abstract class

    but in an interface, all of the methods in the interface will be abstract methods by default

    the variables/state defined in interface will always be final by deafult, all the properties of final will be applicable to them

    we need to override all of the methods if an interface is inherited by a child class

    keywords used to inherit parent classes:
        abstract class  : extends
        interface class : implements

    in abstract, class we can't be inherting from 2 classes (multiple inheritance), if both of the parent classes has 2 same functions, we have problem there.
    but in interface, both methods from parent classes are overridden in the child class, allowing multiple inheritance.

    what is the use of interface when we are required to override every method in the child class ?

*/

/*

object class

    all of the classes in java implicity inherits from class Object

    if a class A is defined, the class extends from class object everytime, implicitly (automatically)

    tostring, equal, clone(s)... all of these methods are included in object class

    object class is the root of every class in java

*/

/*

wrapper class

    1) primitive data types uesd to be reason that java is not 100% oo-programming
    2) so these primitive datatypes are wrapped into class to make it 100% oo-programming

    int     ->  Integer
    char    ->  Character
    float   ->  Float
    double  ->  Double
    long    ->  Long

    starting with smallcase, it is not a class
    starting with capital case, it is a class
    

*/