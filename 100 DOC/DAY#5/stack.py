# Author: Vaikan Peddi 
# Date: 1st October 2023
# Description: Implementing stack data structure and its corresponding operations

class Stack:
    def __init__(self, size):
        self.tos = -1
        self.st = [0] * size
        self.size = size
    
    def isFull(self):
        return self.tos == self.size
        
    def isEmpty(self):
        return self.tos == -1
    
    def push(self, val):
        if self.isFull():
            print("Overflow")
        else:
            self.tos += 1
            self.st[self.tos] = val

    def pop(self):
        if self.isEmpty():
            print("Underflow")
            return
        else:
            tmp = self.tos
            self.tos -= 1
            return self.st[tmp]

    def peek(self):
        return self.st[self.tos]

if __name__ == "__main__":
    s = Stack(10)
    for i in range(1, 10, 2):
        s.push(i)
    print(s.st)
    s.pop()
    print(s.st)