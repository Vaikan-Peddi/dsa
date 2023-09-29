/*

@Author: Vaikan Peddi
@Date: 29th September 2023
@Description: Code to understand basic fundamentals of C++ and introducing OOPS concepts.
              Like Classes, Inheritance, Polymorphism - 3 pillars of OOP philosophy

*/

#include <bits/stdc++.h> //header file from GNU compiler that wraps all of the standard library headers
using namespace std; //since we won't be using custom headers, std simplifies the coding process

class Stack {
    private:
        int size;
        int* stack;
        int tos;
    
    public:
        Stack(int);
        void push(int);
        int pop();
        int getSize();
        int peek();
};

Stack::Stack(int size) {
    this->size = size;
    stack = new int[size];
    this->tos = -1;
}

void Stack::push(int elem) {
    if (tos==size-1) {
        cerr<<"overload"<<endl;
    }
    else {
        stack[++tos] = elem;
    }
}

int Stack::pop() {
    if (tos == -1) {
        cerr<<"Underflow"<<endl;
        return INT_MIN;
    }
    else {
        return stack[tos--];
    }
}

int Stack::getSize() {
    return tos+1;
}

int Stack::peek() {
    cout << stack[tos] << endl;
    return stack[tos];
}

int main() {
    Stack st(5);
    st.push(1);
    st.peek();
    st.push(2);
    st.peek();
    st.pop();
    st.peek();
    return 0;
}