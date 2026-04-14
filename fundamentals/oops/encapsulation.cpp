/*

Encapsulation - Data Hiding

1) why do we use encapsulation, when we are allowing the user to view/modify the data via getter/setter functions ???
2) when should we use encapsulation ???
3) what is encapuslations ???
4) what are public, private, protected keywords ? what do they mean ???
5) what are advantage of using encapsulation ? are there any disadvantages ?
6) what features does encapsulation provide ???

*/

#include <bits/stdc++.h>
using namespace std;

class BankAccount {

private:

    int balance = 0;

public:

    // Setter Function

    void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    // Getter Function:

    int getBalance() {
        return balance;
    }

};

int main() {

    BankAccount savings;

    savings.deposit(1000);
    cout << savings.getBalance() << endl;

    // cout << savings.balance << endl;     this will throw an error

}