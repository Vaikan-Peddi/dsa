# Author: Vaikan Peddi
# Date: 8th October 2023
# Description: This is a code to implement a binary search tree from an array and return the tree object along with functions like search and add and delete

class Node:
    def __init__(self, value:int):
        self.key = value
        self.right = None
        self.left = None

def insert(node, key):

    # Return a new node if the tree is empty
    if node is None:
        return Node(key)

    # Traverse to the right place and insert the node
    if key < node.key:
        node.left = insert(node.left, key)
    else:
        node.right = insert(node.right, key)

    return node

# Inorder traversal
def inorder(root):
    if root is not None:
        # Traverse left
        inorder(root.left)

        # Traverse root
        print(str(root.key) + "->", end=' ')

        # Traverse right
        inorder(root.right)

if __name__ == '__main__':
    root = Node(1)
    for i in range(2,11):
        insert(root, i)

    inorder(root)

