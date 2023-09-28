#include <iostream> //The input-output stream header for inputs and output

int main() {
    //Variables: Named locations that store some values
    //Data types: These are the types of data a language can interpret like int, long, float, etc
    int a = 14;
    float b = 3.14;
    char c = 'a';
    std::string name = "Vaikan";
    bool f = false;

    //Basic Operations:
    //1. Arithmetic:

    int sum = 2+9;
    int product = (int) 2.9 * 9.4;

    // +, -, *, /, %

    //2. Relational: used in checking conditions:
    //>, >=, <, <=, ==, !=

    // Conditional Statements

    if (9>10) {
        sum = 10;
    }
    else {
        sum = 20;
    } //sum=20 since 9<10

    //loops

    sum=0;
    for (int i=0; i<10; i++) {
        sum += i;
    }

    while (sum--) {
        std::cout << "Hello World" <<std::endl;
    }

}