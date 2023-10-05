# Author: Vaikan Peddi
# Date: 5th October 2023
# Description: In this program, we will code up types of Linked lists - Single, Double, Circular, Double Circular

class SingleNode:
    def __init__(self, value:int):
        self.value = value
        self.next = None

class DoubleNode:
    def __init__(self, value:int):
        self.value = value
        self.left = None
        self.right = None

class SingleLinkedList:
    def __init(self):
        self.root = None

    def push(self, value:int):
        if self.root != None:
            self.root = SingleNode(value)
        else:
            tmp = self.root
            while tmp.next != None:
                tmp = tmp.next
            new = SingleNode(value)
            tmp.next = new

    def pop(self, value:int):
        if self.root == None:
            print('List empty!')
        else:
            tmp = self.root
            while tmp.next != None:
                tmp = tmp.next
            tmp = None

    