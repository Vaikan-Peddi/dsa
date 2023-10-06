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

    def display(self):
        if self.root == None:
            print('Empty List')
            return
        else:
            temp = self.root
            while temp != None:
                print(temp.value)
                temp = temp.next
    
class DoublyLinkedList:
    def __init__(self):
        self.root = None
    
    def push(self, value:int) -> None:
        if self.root == None:
            self.root = DoubleNode(int)

        else:
            tmp = self.root
            while tmp.right != None:
                tmp = tmp.right
            tmp.right = DoubleNode(value)
            tmp.right.left = tmp
            
    def pop(self) -> None:
        if self.root == None:
            print('Nothing to pop out, List is mepty')
            return 
        else:
            tmp = self.root
            while tmp.right != None:
                tmp = tmp.right

            tmp2 = tmp.left
            tmp.left = None
            tmp2.right = None

    def display(self):
        if self.root == None:
            print('List is empty to print.')
            return 
        else:
            tmp = self.root
            while tmp!=None:
                print(tmp.value)
                tmp = tmp.next
    
class CircularLinkedList:
    def __init__(self):
        self.root = None

    def push(self, value:int) -> None:
        if self.root == None:
            self.root = SingleNode(value)
            self.root.next = self.root

        else:
            tmp = self.root
            while tmp.next == None:
                tmp = tmp.next
            
            tmp.next = SingleNode(value)
            tmp.next.next = self.root

    def pop(self) -> None:
        if self.root == None:
            print('List is empty to pop anything')
            return 
        
        elif self.root.next.next == self.root:
            self.root.next = self.root
        
        else:
            tmp = self.root

            while tmp.next.next != self.root:
                tmp = tmp.next
            
            tmp.next = self.root

    def display(self):
        if self.root == None:
            print('List is empty to be printed')
        else:
            tmp = self.root
            while(tmp.next != self.root):
                print(tmp.value)
                tmp = tmp.next

class DoubleCircularLinkedList:
    def __init__(self):
        