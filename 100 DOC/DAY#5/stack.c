/*

@Author: Vaikan Peddi
@Date: 1st October 2023
@Description: In today's code, we will implement a stack and its methods like push, pop, peek, isFull, isEmpty.
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct {
    int size;
    int* st;
    int tos;
} stack;

stack* createStack(int);
void push(stack*, int);
int pop(stack*);
int peek(stack*);
bool isFull(stack*);
bool isEmpty(stack*);
void print(stack*);

int main() {
    stack* s = createStack(10);
    for (int i = 1; i <= 10; i+=2) {
        push(s, i);
    }
    print(s);
    return 0;
}

stack* createStack(int size) {
    stack* s = malloc(sizeof(stack));
    s -> size = size;
    s -> tos = -1;
    s -> st = malloc(size * sizeof(int));
    return s;
}

void push(stack* s, int val) {
    if (isFull(s)) {
        printf("Stack Overflow!");
        return;
    }
    else {
        s->st[++s->tos] = val;
    }
}

int pop(stack* s) {
    if (isEmpty(s)) {
        printf("Stack Underflow!");
        return -9999;
    }
    else {
        return s->st[s->tos--];
    }
}

int peek(stack* s) {
    return s->st[s->tos];
}

void print(stack* s) {
    if (isEmpty(s)) {
        printf("Stack is Empty");
    }
    else {
        int i = s->tos;
        while (i>=0) {
            printf("%d ", s->st[i--]);
        }
    }
}

bool isFull(stack* s) {
    return (s->tos == s->size) ? true : false;
}

bool isEmpty(stack* s) {
    return (s->tos == -1) ? true : false;
}