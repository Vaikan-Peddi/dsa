/*
@Author: Vaikan Peddi
@Date: 2nd October 2023
@Description: In today's code, we will implement a simple single linked list in C.
              We will also implement all the methods of a linked list like insert, delete
              print, and various helper functions.
*/

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct Node {
    int value;
    struct Node* next;
} node;

node* createNode(int);
void push(node*, int);
int pop(node*);
void prepend(node*, int);
void print(node*);

int main() {

    return 0;
}

node* createNode(int val) {
    node* new = malloc(sizeof(node));
    new -> next = NULL;
    new -> value = val;
    return new;
}

