# Author: Vaikan Peddi
# Date: 6th October 2023
# Description: We will be coding a binary search tree in this program

class TreeNode:
    def __init__(self, value:int):
        self.value = value
        self.left = None
        self.right = None

class BST:
    def __init__(self):
        self.root = None
    
    def insert(self, value:int)):
        if self.root == None:
            self.root = TreeNode(value)
        else:
            if value >= self.root.value:
                self.insert(self.root.right)
            